package package21;
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
	//here, in the child class we have a constructor, but we are not calling the parent class constructor first :(
	//in order to do that, is just to use the super keywork -> super(intValueHere)
	//so here java will give us a compilation erro
	Car(int maxSpeed) {
		super.maxSpeed = maxSpeed;
	}
	
	public void drive() {
		System.out.printf("Driving car at max speed of %d", maxSpeed);
		
	}
}


public class Puzzle21 {

	public static void main(String[] args) {
		Car fordKa = new Car(120);
		fordKa.drive();
	}

}

/*
 * Whenever in the parent class we have ONLY constructor with arguments,
 * then we must create constructor inside the child class and
 * call the parent class constructor first from the child class constructor
 */
