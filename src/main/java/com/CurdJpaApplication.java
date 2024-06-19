package com;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Example;

import com.model.CurdRepo;
import com.model.Student;



@SpringBootApplication
@PropertySource("app")
public class CurdJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CurdJpaApplication.class, args);

		int b=20;

		Student s4=new Student(104, "d", "e.tech");
		Student s5=new Student(105, "e", "f.tech");
		Student s6=new Student(106, "f", "g.tech");
		Student s7=new Student(107, "g", "M.tech");
	//List<Student> st=List.of(new Student(101, "a", "b.tech"),new Student(102, "b", "c.tech"),new Student(103, "c", "d.tech"));   
//		CurdRepo dc=ctx.getBean("repo",CurdRepo.class);
//		//dc.saveAll(st);
//		System.out.println("All data saved");
//		List<Student> li=dc.findAll();
//		System.out.println("*******************************");
//		for(Student s:li) {
//			System.out.println(s);
//		}
//		System.out.println("********************************");
//		List<Student> l2=dc.findAllById(List.of(101,102));
//		System.out.println("*******************************");
//		for(Student s:l2) {
//			System.out.println(s);
//		}
//		
		
	}

}
