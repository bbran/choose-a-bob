package com.libertymutual.goforcode.chooseabob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Project project1;
	
	@ManyToOne
	private Project project2;
	
	@ManyToOne
	private Project project3;
	
	@Column(nullable=false)
	private String name;
	
	public Student()	{}
	
	public Student (String name)	{
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Project getProject1() {
		return project1;
	}

	public void setProject1(Project project1) {
		this.project1 = project1;
	}

	public Project getProject2() {
		return project2;
	}

	public void setProject2(Project project2) {
		this.project2 = project2;
	}

	public Project getProject3() {
		return project3;
	}

	public void setProject3(Project project3) {
		this.project3 = project3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
