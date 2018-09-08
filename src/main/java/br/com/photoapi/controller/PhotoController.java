package br.com.photoapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.photoapi.model.Photo;
import br.com.photoapi.service.PhotoService;

@RestController
public class PhotoController {
	
	private PhotoService photoService = new PhotoService();
	
	@RequestMapping(value="/photos")
	public ResponseEntity<List<Photo>> getPhotos(){
		return new ResponseEntity<>(photoService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping("/teste2")
	@ResponseBody
	public String teste(){
		return "Olá mundo!!";
	}
	
	

}
