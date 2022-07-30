package puzzle19;

/*
 * Will this code compile? If yes, what will be the output.
 */

abstract class Parent {
	//an abstract method demands that the child class implement it
	//although assigning it as a static method, will not be possible override this method
	//so they are two keyword with contrary behavior
	//this code will give us a compilation error
	abstract static void printMessage(); 
}

class Child extends Parent {
	
	@Override
	void printMessage() {
		System.out.print("Stay Safe");	
		}
}

public class Puzzle19 {

	public static void main(String[] args) {
		//If the word static was removed from the parent method, this code will print -> Stay Safe
		Parent p = new Child();
		p.printMessage();
		
	}

}
