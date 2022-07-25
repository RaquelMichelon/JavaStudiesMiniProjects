package puzzle05;

/*
 * Will this code compile? If yes, what will be the output?
 * This question is based on the dynamic of polymorphism
 */

class Transport { //there is no compilation error
	
	int maxSpeed = 200; //instance variable
	
	public static void drive() {  //static method ///CLASS METHOD
		System.out.println("Driving Transport!");
	}
	
	public void race() {  //instance method
		System.out.println("Driving at Speed " + maxSpeed);
	}
	
}

class Car extends Transport { //there is no compilation error
	
	int maxSpeed = 180; //HIRE THE PARENT VALUE
	
	public static void drive() {  //static method ///CLASS METHOD
	System.out.println("Driving Car!");
	}
	
	public void race() { //instance method
		System.out.println("Driving at Speed " + maxSpeed);
	}
}


public class Puzzle05 { //there is no compilation error
	public static void main(String[] args) {
		Transport t = new Car();
		//warning: The static method drive() from the type Transport should be accessed in a static way
		t.drive();  //statement 1 - Output: Driving Transport! - here we are accessing an object of Transport class using its object, but it will give a warning.
		t.race(); //statement 2 - Output: Driving at Speed 180
		System.out.println(t.maxSpeed); //statement 3 - Output: 200 - Variables can not be override
	}

}

/*
 * using the parent reference, we are trying to access the drive() and the race() methods and the instance
 * variable maxSpeed.
 * To understand the output, we need to know what kind of methods in Java accept being override;
 * 1 - static methods cannot be override. Static methods of a class just belongs to the class, which means
 * that they not belongs to the object. Because of that IS NOT POSSIBLE OVERRIDE STATIC METHODS.
 * The overrides are method specifically available with objects
 * 
 * ALL METHODS THAT WE CANNOT OVERRIDE: STATIC, FINAL, PRIVATE, VARIABLE
 * 
 * Important notes: 
 * things we are able to override, it will be called from the child class
 * otherwise it will be called from the parent class
 */
