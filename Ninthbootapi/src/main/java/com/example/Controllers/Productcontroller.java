package com.example.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Product;
import com.example.Repository.Productrepo;

@RestController
public class Productcontroller {
    @Autowired
	private Productrepo repo1;
	@PostMapping("/postproducts")
	public ResponseEntity<Product> postdata(@RequestBody Product k)
	{
		return new ResponseEntity<>(repo1.save(k), HttpStatus.CREATED);

	}
	@GetMapping("/getproducts")
	public ResponseEntity<List<Product>> getdata()
	{
		return new ResponseEntity<>(repo1.findAll(),HttpStatus.FOUND);

	}
	@GetMapping("/getproducts/{id}")
	public ResponseEntity<Product> getsingledata(@PathVariable long id )
	{
		Optional<Product> obj = repo1.findById(id);
		if(obj.isPresent()) {
			return new ResponseEntity<>(obj.get(), HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updatedata(@PathVariable long id, @RequestBody Product a)
	{
		Optional<Product> obj = repo1.findById(id);
		if(obj.isPresent()) {
		Product save = repo1.save(a);
		return new ResponseEntity<>(save, HttpStatus.OK);
	}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Product> deletesingledata(@PathVariable long id )
	{
		Optional<Product> obj = repo1.findById(id);
		if(obj.isPresent()) {
			repo1.deleteById(id);
			return new ResponseEntity<>( HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}




