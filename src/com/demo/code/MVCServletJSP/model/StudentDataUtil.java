package com.demo.code.MVCServletJSP.model;

import java.util.ArrayList;
import java.util.List;

import com.demo.code.MVCServletJSP.entity.Student;

public class StudentDataUtil {
	
	public static List<Student> getStudent(){
		
		
		List<Student> studentList = new ArrayList();
		
		
		studentList.add(new Student("Mahesh","Magai","magaimahesh@gamail.com"));
		studentList.add(new Student("Aishu","Magai","magaiaishu@gamail.com"));
		
		
		return studentList;
	}

}
