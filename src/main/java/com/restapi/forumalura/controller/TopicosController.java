package com.restapi.forumalura.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restapi.forumalura.model.Curso;
import com.restapi.forumalura.model.Topico;

@Controller
public class TopicosController {
	
	@RequestMapping()
	public List<Topico> Lista() {
		
		Topico topico = new Topico("Dúvida" , "Dúvida com Spring", new Curso("Spring", "Programação"));
		return Arrays.asList(topico, topico, topico);
		
	}

}
