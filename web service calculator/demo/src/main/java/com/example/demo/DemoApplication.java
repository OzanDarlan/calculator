package com.example.demo;

import com.example.demo.rest.Controller;
import com.example.demo.rest.Model;
import com.example.demo.rest.RestCalculator;
import com.example.demo.rest.View;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo.rest"})
public class DemoApplication {

	public static void main(String[] args) {
		Model m = new Model();
		View v = new View();
		RestCalculator r = new RestCalculator(m);
		Controller c = new Controller(m, v, r);
		SpringApplication.run(DemoApplication.class, args);
	}

}
