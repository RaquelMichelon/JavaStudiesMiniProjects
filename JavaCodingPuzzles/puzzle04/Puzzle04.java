package puzzle04;

/*
 * Will this code compile? If yes, what will be the output?
 */

class Transport {
	
	public void drive() {
		System.out.println("Driving Transport!");
	}
	
}

class Car extends Transport {
	@Override
	public void drive() {  //this method overrides the drive method in Transport class
	System.out.println("Driving Car!");
	}
	
	public void playMusic() {
		System.out.println("Playing Music in the car!");
	}
}

public class Puzzleo4 {
	
public static void main(String[] args) {
		
		Transport c = new Car(); //an example of dynamic polymorphism, using the parent class reference and creating an object of the child class
		c.drive(); //using the parent reference, call the drive method overrided by the child //Output: Driving Car!
		c.playMusic(); //using the parent reference, call the playMusic method - COMPILATION ERROR

	}

}
