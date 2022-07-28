package puzzle11;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Parent { //the class should be abstract - COMPILE ERROR
	public abstract void printName();
}

public class Child {
	@Override
	public void printName() {
		System.out.println("Java programming");
	}
	
}

public class Puzzle11 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.printName();

	}

}

/*
 * the class parent have one abstract method, and because of that, the class itself should be also abstract.
 * Because of that, we will have a compilation error.
 */
