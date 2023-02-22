
package com.example.Controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Category;
import com.example.Repository.Categoryrepo;


@RestController
public class Categorycontroller {
        @Autowired
		private Categoryrepo repo;
       
	@PostMapping("/postcategories")
	public ResponseEntity<Category> postdata(@RequestBody Category k)
	{
		return new ResponseEntity<>(repo.save(k), HttpStatus.CREATED);

	}
	@GetMapping("/getcategories")
	public ResponseEntity<List<Category>> getdata()
	{
		return new ResponseEntity<>(repo.findAll(),HttpStatus.FOUND);

	}
	
	@GetMapping("/get/categories")
	public ResponseEntity<Page<Category>> getdata(@RequestParam (required = false, defaultValue = "0")int page)
	{
		final Pageable pages = PageRequest.of(0, page);
		return new ResponseEntity<>(repo.findAll(pages), HttpStatus.OK);
		}
		
	
	
	@GetMapping("/getcategories/{id}")
	public ResponseEntity<Category> getsingledata(@PathVariable long id )
	{
		Optional<Category> obj = repo.findById(id);
		if(obj.isPresent()) {
			return new ResponseEntity<>(obj.get(), HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/categories/{id}")
	public ResponseEntity<Category> updatedata(@PathVariable long id, @RequestBody Category a)
	{
		Optional<Category> obj = repo.findById(id);
		if(obj.isPresent()) {
		Category save = repo.save(a);
		return new ResponseEntity<>(save, HttpStatus.OK);
	}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//(required = false, defaultValue = "0")
	
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<Category> deletesingledata(@PathVariable long id )
	{
		Optional<Category> obj = repo.findById(id);
		if(obj.isPresent()) {
			repo.deleteById(id);
			return new ResponseEntity<>( HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}


