package com.ariq.animalapp2.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ariq.animalapp2.animal.*;


public class MainApp {

	public static void main(String[] args) {
		////////////////
		System.out.println("\nJava Config:");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MainConfig.class);
		
		Animal animal1 = context.getBean("Cat", Animal.class);
		Cat cat1 = (Cat) animal1;
		
		
		System.out.println("Animal spesies: "+cat1.getSpesies());
		System.out.println("Animal Name: "+cat1.getName());
		System.out.println("Animal Race: "+cat1.getRace());
		System.out.println("Animal Age: "+cat1.getAge());
		System.out.println("Animal Health: "+cat1.getHealth());
		System.out.println("Animal Color: "+cat1.getColor());
		context.close();
		
		
	}

}
