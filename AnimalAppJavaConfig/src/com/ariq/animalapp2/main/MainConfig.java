package com.ariq.animalapp2.main;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.ariq.animalapp2.animal.*;

@Configuration
@PropertySource("classpath:animal.properties")
public class MainConfig {
	
	@Bean
	public Animal Cat(	@Value("${Cat1.spesies}") String spesies,
			@Value("${Cat1.name}") String name,
			@Value("${Cat1.race}") String race,
			@Value("${Cat1.age}") int age,
			@Value("${Cat1.health}") String health,
			@Value("${Cat1.color}") String color)  {
		
		Cat cat1 = new Cat(spesies, name, race, age, health,color);
		return cat1;
	}
}

