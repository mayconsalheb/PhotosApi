package br.com.photoapi.security;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenAuthenticationService {
	
	// EXPIRATION_TIME = 10 dias
	static final long EXPIRATION_TIME = 860_000_000;
	static final String SECRET = "MySecret";
	static final String TOKEN_PREFIX = "Bearer";
	static final String HEADER_STRING = "Authorization";
								  
	public static void addAuthentication(HttpServletResponse resp, String userName){
		String JWT = Jwts.builder()
						.setSubject(userName)
						.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
						.signWith(SignatureAlgorithm.HS256, SECRET)
						.compact();
		
		resp.addHeader(HEADER_STRING, TOKEN_PREFIX+" "+JWT);
	}
	
	public static Authentication getAuthentication(HttpServletRequest req){
		String token = req.getHeader(HEADER_STRING);
		
		if(token != null){
			String userName = Jwts.parser()
								.setSigningKey(SECRET)
								.parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
								.getBody()
								.getSubject();
			
			if(userName != null){
				return UsernamePasswordAuthenticationToken(userName, null, Collections.emptyList());
			}
		}
		
		return null;
	}

}
