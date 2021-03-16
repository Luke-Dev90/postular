package com.chalela.postular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chalela.postular.model.Persona;
import com.chalela.postular.repository.IPersonaRepository;

@RestController
@RequestMapping("/postular")
public class PostularController {

	@Autowired
	private IPersonaRepository iPerson;
	
	@GetMapping
	public List<Persona> Listar(Persona persona, Model model){
		 return iPerson.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona persona) {
		iPerson.save(persona);
	}
	
	@PutMapping
	public void actualizar(@RequestBody Persona persona) {
		iPerson.save(persona);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		iPerson.deleteById(id);
	}
}
