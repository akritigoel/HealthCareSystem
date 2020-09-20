package org.com.capg.healthcare.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class TestCenter {

	@Id
	private int centerId;
	
	@JsonManagedReference
	@OneToMany(targetEntity=Test.class)
	private List<Test> tests;
}
