package puzzle11;


public abstract class Parent { 
	public abstract void printName();
}

public class Child {
	@Override
	public void printName() {
		System.out.println("Java programming");
	}
	
}

public class Puzzle11Solved {

	public static void main(String[] args) {
		Parent p = new Child();
		p.printName();

	}

}

