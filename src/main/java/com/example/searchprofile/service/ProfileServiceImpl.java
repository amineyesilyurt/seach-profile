package com.example.searchprofile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.searchprofile.entity.Profile;
import com.example.searchprofile.repo.ProfileRepository;

@Service 
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	ProfileRepository repository;

	public Profile save(Profile newUser) {
		return repository.save(newUser);
	}

	@Override
	public List<Profile> showAll() {
		return repository.findAll();
	}
	
	

}
