package br.com.photoapi.dao;

import java.util.List;

import br.com.photoapi.model.Photo;

public interface DAO {
	
	public List<Photo> findAll();

}
