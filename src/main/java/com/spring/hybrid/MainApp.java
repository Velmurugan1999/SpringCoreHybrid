package com.spring.hybrid;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Logger logger=Logger.getLogger("MainApp");
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");
		Student st1=context.getBean(Student.class);
		st1.setId(11);
		st1.setName("Amit");
		st1.setDepartment("ECE");
		Student st2=context.getBean(Student.class);
		st2.setId(21);
		st2.setName("Kumar");
		st2.setDepartment("MECH");
		logger.info(st1.toString());
		logger.info(st2.toString());
	}

}
