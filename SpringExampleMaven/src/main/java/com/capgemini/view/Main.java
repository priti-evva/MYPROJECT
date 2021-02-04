package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp=(Employee)context.getBean("emp");
		
		
		System.out.println(emp.getEmpNumber());
		System.out.println(emp.getName());
	

	}

}
