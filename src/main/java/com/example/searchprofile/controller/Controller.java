package com.example.searchprofile.controller;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchprofile.entity.Profile;
import com.example.searchprofile.service.ProfileService;

@RestController()
@RequestMapping("/profile")
public class Controller {
	
	@Autowired
	ProfileService profileService;
	
	@PostMapping(path = "/create", 
	        consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Profile> create(@RequestBody Profile newUser) throws ServerException {

	    Profile user = profileService.save(newUser);
	    if (user == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(user, HttpStatus.CREATED);
	    }
	}
	
	@GetMapping(path ="/show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Profile> showProfiles(@RequestBody Profile profile){
		return profileService.showAll();
	}

	

}
