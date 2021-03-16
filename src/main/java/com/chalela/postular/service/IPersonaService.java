package com.chalela.postular.service;

import java.util.List;
import com.chalela.postular.model.Persona;

public interface IPersonaService {
	
	public List<Persona> findByAll();
	
	public Persona getById(Long id);
	
	public void save(Persona persona);
	
	public void delete(Long id);
	
}
