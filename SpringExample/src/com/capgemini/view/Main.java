package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp=(Employee)context.getBean("emp");
		
		emp.setEmpNumber(30);
		emp.setName("piya");
		
		System.out.println(emp.getEmpNumber());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getZipcode());
		
		

//		Employee emp2=context.getBean("emp",Employee.class);//creating obj by passing class in parameter
//		
//	
//		System.out.println(emp2.getEmpNumber());
//		System.out.println(emp2.getName());
//	

	}

}
