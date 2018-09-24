package br.com.photoapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.photoapi.dao.DAO;
import br.com.photoapi.model.Photo;

@Service
public class PhotoService {
	
	@Autowired
	private DAO photoDao;
	
	public List<Photo> findAll(){
		return photoDao.findAll();
	}
	
	public List<Photo> findFromUser(String userName){
		return photoDao.findFromUser(userName);
	}

}
