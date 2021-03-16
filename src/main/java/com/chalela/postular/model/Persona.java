package com.chalela.postular.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Persona {

	@Id
	private int idPerson;
	private String name;
	private String lastName;
	private String address;
	private String phone;
	private String skills;
	
}
