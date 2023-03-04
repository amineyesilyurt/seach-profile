package com.example.searchprofile.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.searchprofile.entity.Profile;

public interface ProfileService {

	Profile save(Profile newUser);

	List<Profile> showAll();

}
