package br.com.photoapi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import br.com.photoapi.model.Photo;


public class PhotoDao implements DAO{
	
	List<Photo> photos = new ArrayList<Photo>();
	
	{
	
		photos.add(new Photo("http://www.portaljava.com.br/wp-content/uploads/2017/11/java.jpg", "Java Photo"));
		photos.add(new Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW5KWrvEtc96alYLcWEVO7eOoXmJQlK0XuZwaYNY3J0uG6Iqtz", "Node Photo"));
	}
	
	public List<Photo> findAll(){
		return photos;
	}

}
