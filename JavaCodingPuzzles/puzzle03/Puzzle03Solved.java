package puzzle03;

class Transport {
	
	public void drive() {
		System.out.println("Transport driving!");
	}
	
}

class Car extends Transport {
	@Override
	public void drive() { 
	System.out.println("Car driving!");
	}
}


public class Puzzle03Solved {
	
	public static void main(String[] args) {
		
		Transport c = new Car();
		c.drive();

	}

}
