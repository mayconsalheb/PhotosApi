package br.com.photoapi.service;

import java.util.List;

import br.com.photoapi.dao.DAO;
import br.com.photoapi.dao.PhotoDao;
import br.com.photoapi.model.Photo;

public class PhotoService {
	
	private DAO photoDao = new PhotoDao();
	
	public List<Photo> findAll(){
		return photoDao.findAll();
	}

}
