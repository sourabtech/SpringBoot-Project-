package com.anudip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@SpringBootApplication
public class EmployeecrudspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeecrudspringApplication.class, args);
	}

}


/*
 	step -1:
 	first --> file --> New --> Spring starter project ----> project create karatana thyat web tool ,mysql driver, jpa driver add kara.
     
     step -2:
     src/main/java folder made com.anudip package create zale asel.
     
     step-3:
     com.anudip vr right click ---> create one package com.anudip.entity and that package create one class Employee,
     thya class made employee chi entity create kara thyala deafult constructor, parameterze constructor, getter setter,and to string create kar thya entity chi using -->right click -->source.
     employee class chya vr @Entity manun ani tya  entity tayar kelet tya vr @Id ani @GeneratedValue(strategy = GenerationType.IDENTITY)  type kar.
     
   
   
   
   
   
   
   
   
 */
