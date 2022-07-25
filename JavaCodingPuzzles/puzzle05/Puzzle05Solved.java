package puzzle05;

class Transport { 
	
	int maxSpeed = 200; 
	
	public static void drive() {  
		System.out.println("Driving Transport!");
	}
	
	public void race() {  
		System.out.println("Driving at Speed " + maxSpeed);
	}
	
}

class Car extends Transport { 
	
	int maxSpeed = 180; 
	
	public static void drive() {  
	System.out.println("Driving Car!");
	}
	
	public void race() { 
		System.out.println("Driving at Speed " + maxSpeed);
	}
}
public class Puzzle05Solved {
	public static void main(String[] args) {
		Transport t = new Car();
		Transport.drive();  //Driving Transport!
		t.race();  //Driving at Speed  180
		System.out.println(t.maxSpeed); //200
	}

}
