package br.com.photoapi.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import br.com.photoapi.model.Photo;

@Repository
public class PhotoDao implements DAO{
	
	Map<String,List<Photo>> userPhotos = new HashMap<>();
	
	@PostConstruct
	public void init(){
		List<Photo> photos = Arrays.asList(
				//Flavio's Photos
				new Photo("http://www.portaljava.com.br/wp-content/uploads/2017/11/java.jpg", "Java Photo"),
				new Photo("https://cdn-images-1.medium.com/max/2000/1*aeWo6e6FC8InJwBl3TmpDw.jpeg", "Node Photo"),
				new Photo("https://becode.com.br/wp-content/uploads/2017/09/php-post-1.png", "Php Photo"),
				new Photo("https://i0.wp.com/blog.eduonix.com/wp-content/uploads/2015/11/C-3-More-on-C-Syntax.png?ssl=1", "C++ Photo")
		);
		userPhotos.put("flavio", photos);
		
		//Jose's Photos
		photos = Arrays.asList(
				new Photo("https://guiatech.net/wp-content/uploads/2018/05/python-download-e-instalacao-win10.jpg", "Python Photo"),
				new Photo("https://static1.squarespace.com/static/59090f2e6a496317a4cf80fc/t/591f7ae6d1758e1295eba2a8/1529428517353/?format=1500w", "Ruby Photo"),
				new Photo("https://cdn-images-1.medium.com/max/1200/1*wDnsF_dr5KqH3O5R5BjbPQ.png", "Groovy Photo"),
				new Photo("https://cdn-images-1.medium.com/max/800/1*YK5PLgDKciZ0J66Ilvb9wQ.png", "Kotlin Photo")
		);
		userPhotos.put("jose", photos);
	}
	
	//TODO 
	public List<Photo> findAll(){
		List<Photo> photos = new ArrayList<>();
		userPhotos.entrySet().forEach(photo->{
				photos.addAll(photo.getValue());
			});
		return photos;
	}

	@Override
	public List<Photo> findFromUser(String userName) {
		return userPhotos.get(userName);
	}
}
