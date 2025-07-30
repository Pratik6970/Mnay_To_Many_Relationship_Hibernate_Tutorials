package com.app.ManyToMantProjects;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.ManyToMantProjects.pojos.Course;
import com.app.ManyToMantProjects.pojos.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Mant To Many Realtionship here" );
        
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sfg = cfg.buildSessionFactory();
        
        Student std1 = new Student();
      
        std1.setName("Rahul");
        
        Student std2 = new Student();
       
        std2.setName("Vaibhav");
        
        Student std3 = new Student();
     
        std3.setName("Vasu");
        
        Course course1 = new Course();
    
        course1.setCourseName("JAVA");
        
        Course course2= new Course();
      //  course2.setCourseId(102);
        course2.setCourseName("Phyton");
        
        Course course3= new Course();
       // course2.setCourseId(103);
        course3.setCourseName("hibernate");
        
        Set<Course>courseList1 = new HashSet<>();
        courseList1.add(course1);
        courseList1.add(course2);
        
        Set<Course>courseList2 = new HashSet<>();
        courseList2.add(course1);
        courseList2.add(course3);
        
        std1.setCourses(courseList1);
        
        std2.setCourses(courseList2);
        
        Set<Student>studentList1 = new HashSet<>();
        studentList1.add(std1);
        studentList1.add(std2);
        
        Set<Student>studentList2 = new HashSet<>();
        studentList2.add(std1);
        studentList2.add(std3);
        
       course1.setStudents(studentList1);
       course2.setStudents(studentList2);
       
       Session session = sfg.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(course1);
       session.save(course2);
       session.save(course3);  

       session.save(std1);
       session.save(std2);
       session.save(std3);

       tx.commit();
       
       session.close();
        
        
        
        
        
        
    }
}
