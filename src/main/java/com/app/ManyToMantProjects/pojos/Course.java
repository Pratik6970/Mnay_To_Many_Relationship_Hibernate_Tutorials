package com.app.ManyToMantProjects.pojos;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cou_45")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COURSEID")
	private Integer courseId;
	
	@Column(name="COURSENAME")
	private String courseName;
	
	@ManyToMany(mappedBy = "courses")
	private Set<Student>students;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(Integer courseId, String courseName, Set<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.students = students;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	

}
