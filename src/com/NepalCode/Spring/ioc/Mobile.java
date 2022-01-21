package com.NepalCode.Spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		// bad practice
		/*NCELL ncell= new NCELL();
		ncell.calling();
		ncell.data();
		System.out.println("-----------------------------------");
		
		NTC ntc = new NTC();
		ntc.calling();
		ntc.data();
		
		System.out.println("-----------------------------------");
		
		Sky sky = new Sky();
		sky.calling();
		sky.data();
		
		System.out.println("-----------------------------------");
		*/
		System.out.println("-----------------------------------");
		// good practice
		/* Sim sim = new NCELL();
		sim.calling();
		sim.data();
		
		System.out.println("-----------------------------------");
		*/
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		NCELL n = context.getBean("ncell", NCELL.class);
		n.calling();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Sim s= context.getBean("sim", Sim.class);
		s.calling();
		s.data();

	}

}
