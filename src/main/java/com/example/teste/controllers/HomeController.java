package com.example.teste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")

public class HomeController {
	
	@RequestMapping("/listar")
	public String listar() {
		return "RL System!";
	}
	
	@RequestMapping("/")
	
	public String index() {
		return "HOMES";
	}
	

}
