package com.example.firstdynamic.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstdynamic.Entity.details;
import com.example.firstdynamic.payload.logindetails;

public interface repodetails extends JpaRepository<details, Integer> {

	details findById(int id);

	Optional<details> findByEmail(String email);




}
