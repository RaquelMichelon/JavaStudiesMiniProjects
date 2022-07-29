package puzzle17;

/*
 * Will this code compile? If yes, what will be the output?
 */

class Parent {
	public void printMessage() {
		System.out.println("Happy Friday from Parent class");
	}
}

class Child extends Parent {
	@Override
	public void printMessage() {
		System.out.println("Happy Friday from Child class");
	}
}
public class Puzzle17 {

	public static void main(String[] args) {
		//explicit type casting the parent class into the child class, so java will not give the compilation error
		//but it is not possible do that, so java will give a runtime error and get an exception
		// a car is a vehicle but a vehicle isn't a car.
		Child c = (Child)new Parent(); 
		c.printMessage();
	}

}

/*
 * This program will give you a runtime exception.
 */
