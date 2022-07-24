package puzzle04;

class Transport {
	
	public void drive() {
		System.out.println("Driving Transport!");
	}
	
}

class Car extends Transport {
	@Override
	public void drive() {  
	System.out.println("Driving Car!");
	}
	
	public void playMusic() {
		System.out.println("Playing Music in the car!");
	}
}

public class Puzzle04Solved {
	
public static void main(String[] args) {
		
		Car c = new Car(); 
		c.drive(); 
		c.playMusic(); 

	}

}
