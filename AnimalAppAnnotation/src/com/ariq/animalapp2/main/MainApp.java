package com.ariq.animalapp2.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.ariq.animalapp2.animal.*;


public class MainApp {

	public static void main(String[] args) {
	
///////////////
		System.out.println("\nAnnotation:");
		ClassPathXmlApplicationContext context3 = 
				new ClassPathXmlApplicationContext("AnimalAnnotationConfig.xml");

		Animal animal3 = context3.getBean("cat", Animal.class);

		System.out.println("Animal spesies: "+animal3.getSpesies());
		System.out.println("Animal Name: "+animal3.getName());
		System.out.println("Animal Race: "+animal3.getRace());
		System.out.println("Animal Age: "+animal3.getAge());
		System.out.println("Animal Health: "+animal3.getHealth());
		System.out.println("Animal Color: "+animal3.getColor());
	
		context3.close();
	}

}
