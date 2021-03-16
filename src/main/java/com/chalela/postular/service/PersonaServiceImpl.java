package com.chalela.postular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chalela.postular.model.Persona;


@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private PersonaServiceImpl iPerson;
	
	@Override
	public List<Persona> findByAll() {
		return iPerson.findByAll();
	}

	@Override
	public Persona getById(Long id) {
		return iPerson.getById(id);
	}


	@Override
	public void save(Persona persona) {
		iPerson.save(persona);
	}

	@Override
	public void delete(Long id) {
		iPerson.delete(id);
	}

}
