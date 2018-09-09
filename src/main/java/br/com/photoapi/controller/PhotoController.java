package br.com.photoapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.photoapi.model.Photo;
import br.com.photoapi.service.PhotoService;

@RestController
public class PhotoController {
	
	private PhotoService photoService = new PhotoService();
	
	@GetMapping("/photos")
	public List<Photo> getPhotos(){
		return photoService.findAll();
	}
	
	@GetMapping("/photos/{userName}")
	public List<Photo> getPhotosFromUser(@PathVariable(value="userName") String userName){
		return photoService.findFromUser(userName);
	}

}
