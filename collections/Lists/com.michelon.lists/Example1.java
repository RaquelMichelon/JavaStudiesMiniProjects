package com.michelon.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {

	public static void main(String[] args) {
		
		//List is a generic interface
		List<String> names = new ArrayList<> ();
		
		//to add elements
		
		names.add("Carlos");
		names.add("Raquel");
		names.add("José");
		
		System.out.println(names); //[Carlos, Raquel, José]
		
		
		//to remove elements
		names.remove(2);
		System.out.println(names); //[Carlos, Raquel]
		
		names.remove("Raquel");
		System.out.println(names); //[Carlos]
		
		
		//how to iterate
		names.add("Raquel");
		names.add("José");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Nome:" + names.get(i));
			//Nome:Carlos
			//Nome:Raquel
			//Nome:José
		}
		
			//enhanced for 
		for (String name : names) {
			System.out.println("Nome:" + name);
			//Nome:Carlos
			//Nome:Raquel
			//Nome:José
		}
		
			//using forEach() passing an instance of Consumer Interface
		//here we are creating an anonymous class
		names.forEach(new Consumer<String>() { //for each element of names list the method accept will be called

			@Override
			public void accept(String t) {
				System.out.println(t);
				//Carlos
				//Raquel
				//José
				
			}});
		
		
			//using forEach(), Consumer Interface (which is a @FunctionalInterface) and Lambda Expression
		names.forEach(name -> {
			System.out.println(name);
			//Carlos
			//Raquel
			//José
		});
		
		//it is just one block, so it can be simplified as:
		names.forEach(name -> System.out.println(name));
		//Carlos
		//Raquel
		//José
		
		//the lambda expression is just calling the method to print, so we can use method reference to left this code more elegant
		names.forEach(System.out::println); //instead of calling the method println, we just put a reference to that method 
		//Carlos
		//Raquel
		//José
		
		
		
	}

}
