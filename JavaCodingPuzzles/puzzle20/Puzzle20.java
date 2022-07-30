package puzzle20;
/*
 * Will this code compile? If yes, what will be the output.
 */

class Transport {
	int maxSpeed;
	
	Transport(int maxSpeed) { //only constructor with arguments in the parent class, so it is compulsory create a constructor in the child class
		this.maxSpeed = maxSpeed;
	}
	
	public void drive() {
		System.out.printf("Driving transport at max speed of %d", maxSpeed);
	}
}

class Car extends Transport {
	//we don't have a constructor, so java will have a compilation error
	
	//THIS METHOD IS OVERRIDING THE PARENT METHOD
	public void drive() {
		System.out.printf("Driving car at max speed of %d", maxSpeed);
		
	}
}


public class Puzzle20 {

	public static void main(String[] args) {
		Car fordKa = new Car();
		fordKa.drive();
	}

}

/*
 * Whenever in the parent class we have ONLY constructor with arguments,
 * then we must create constructor inside the child class and
 * call the parent class constructor first from the child class constructor
 */
