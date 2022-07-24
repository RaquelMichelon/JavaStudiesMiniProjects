package puzzle03;

/*
 * Will this code compile? If yes, what will be the output?
 * This question is based on the dynamic of polymorphism
 */

class Transport {
	
	public void drive() {
		System.out.println("Transport driving!");
	}
	
}

class Car extends Transport {
	public void drive() {  //this method overrides the drive method in Transport class
	System.out.println("Car driving!");
	}
}


public class Puzzle03 {
	
	public static void main(String[] args) {
		
		Car c = new Transport();
		c.drive();

	}

}

/*
 * When an object of a child class try to access a method of parent class that it don't have
 * java will be an ambiguity - you can not access child class to access the parent class, so it will 
 * produce a compilation error
 * 
 * Transport t = new Transport(); ok
 * Car c = new Car(); ok
 * Transport t2 = new Car(); ok, but I just can access parent methods;
 * Car c2 = new Transport(); NOT OK - COMPILATION ERROR - ambiguity
 */
 
