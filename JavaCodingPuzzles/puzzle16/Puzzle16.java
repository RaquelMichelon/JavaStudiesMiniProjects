package package16;

/*
 * Which of the following lines will give a compilation error?
 */


abstract class Parent {
	public abstract void printMessage();
}

class Child extends Parent {
	@Override
	public void printMessage() {
		System.out.println("Happy Friday");
	}
}

public class Puzzle16 {

	public static void main(String[] args) {
		Parent pp = new Parent(); //COMPILATION ERROR BECAUSE WE CANNOT CREATE AN OBJECT FROM AN ABSTRACT CLASS
		Child cc = new Child();
		Parent pc = new Child();
		Child cp = new Parent(); //COMPILATION ERROR BECAUSE WE CANNOT CREATE A PARENT CLASS OBJECT AND STORE IT IN A CHILD CLASS REFERENCE

	}

}
