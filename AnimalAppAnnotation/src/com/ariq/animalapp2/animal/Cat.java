package com.ariq.animalapp2.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
	

	private String spesies="cat";
	private String name;
	private String race;
	private int age;
	private String health;
	private String color;

	public Cat() {
		super();
	}
	
	@Autowired
	public Cat(	@Value("${Cat1.spesies}") String spesies,
				@Value("${Cat1.name}") String name,
				@Value("${Cat1.race}") String race,
				@Value("${Cat1.age}") int age,
				@Value("${Cat1.health}") String health,
				@Value("${Cat1.color}") String color) 
	{		
		super();
		this.spesies = spesies;
		this.name = name;
		this.race = race;
		this.age = age;
		this.health = health;
		this.color = color;
	}
	////////////////////Spesies
	@Override
	public String getSpesies() {
		return spesies;
	}

	public void setSpesies(String spesies) {
		this.spesies = spesies;
	}
	////////////////////Name
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	////////////////////
	@Override
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	////////////////////
	@Override
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	////////////////////
	@Override
	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}
	////////////////////
	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
