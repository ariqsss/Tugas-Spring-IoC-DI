package com.ariq.animalapp2.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.ariq.animalapp2.animal.*;


public class MainApp {

	public static void main(String[] args) {
		////////////////
		
		System.out.println("\nXML:");
		ClassPathXmlApplicationContext context2 = 
		new ClassPathXmlApplicationContext("AnimalXMLConfig.xml");
	
		Animal animal2 = context2.getBean("Dog1", Animal.class);

		System.out.println("Animal spesies: "+animal2.getSpesies());
		System.out.println("Animal Name: "+animal2.getName());
		System.out.println("Animal Race: "+animal2.getRace());
		System.out.println("Animal Age: "+animal2.getAge());
		System.out.println("Animal Health: "+animal2.getHealth());
		System.out.println("Animal Color: "+animal2.getColor());
		context2.close();

	}

}
