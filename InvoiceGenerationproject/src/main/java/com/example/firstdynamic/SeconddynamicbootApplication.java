package com.example.firstdynamic;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.firstdynamic.service.reportservice;

import net.sf.jasperreports.engine.JRException;

@SpringBootApplication
public class SeconddynamicbootApplication {

	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SeconddynamicbootApplication.class, args);
	}

}
