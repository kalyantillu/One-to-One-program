package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Category;

public interface Categoryrepo extends JpaRepository<Category,Long>{

}
