package puzzle25;

/*
 * Will this code compile? If yes, what will be the output.
 */

abstract class Parent {

	Parent(String message) {
		System.out.println(message);
	}
}

class Child extends Parent { //both constructors have in this case the responsability of call the parent class
	
	Child(String message) { //COMPILATION ERROR - call to parent class is not present here - 
		//what is missing: super("With some message here");
		System.out.println(message);
	}
	
	Child() { //this second contructor is calling the parent class constructor explicitly using super keyword
		super("Happy Friday!");
	}
	
	public void celebrate() {
		System.out.print("Celebrating Friday.");	
		}
}

public class Puzzle25 {

	public static void main(String[] args) {
		Child c = new Child(); //before check here, java will check the design of the classes
		c.celebrate();;
		
	}

}

/*
 * Understanding the constructor when there is a relationship parent/child
 * whenever we create the object of the child class, it will call the constructor of child class
 * But it is compulsory to call parent class constructor from child class constructor if all constructors in the parent class
 * have arguments
 * that is called "constructor chaining"
 */
