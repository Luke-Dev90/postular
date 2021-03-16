package com.chalela.postular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chalela.postular.model.Persona;

public interface IPersonaRepository extends JpaRepository <Persona,Integer> {

}
