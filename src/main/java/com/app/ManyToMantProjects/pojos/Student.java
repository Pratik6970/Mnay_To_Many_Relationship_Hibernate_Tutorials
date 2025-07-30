package com.app.ManyToMantProjects.pojos;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="stds_456")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="ID")
	private Integer id;
	
     @Column(name="NAME")
	private String name;
	
	
	@ManyToMany
	@JoinTable(name="std_cou_456",
	joinColumns = @JoinColumn(name="st_id"),
	inverseJoinColumns = @JoinColumn(name="ct_id")
	
			)
	
	
	private Set<Course>courses;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, Set<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	

}
