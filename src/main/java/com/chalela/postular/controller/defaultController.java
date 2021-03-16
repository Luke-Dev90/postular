package com.chalela.postular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.chalela.postular.repository.IPersonaRepository;

@Controller
public class defaultController {

		@Autowired
		private IPersonaRepository iPerson;
		
		public String listar(Model model) {
			model.addAttribute("personas", iPerson.findAll());
			return "index";
		}
}
