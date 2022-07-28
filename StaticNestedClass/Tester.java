package staticnestedclass;

public class Tester {
	
	public static void main(String args[]) {
		
		Outer.StaticNested.displayText(); //we can call this method without instantiate an object
		
		//Or create an instance like bellow
		//Outer.StaticNested osn = new Outer.StaticNested();
		//osn.displayText();
		
	}

}

class Outer {
	
	String text = "outer text";
	private static String message = "outer message";
	
	
	
	static class StaticNested {
		
		static String text = "nested text";
		
		static void displayText() {
			System.out.println(text); //nested text
			System.out.println(message); //outer message
			System.out.println(new Outer().text); //outer text //new object to access a non static variable
		}
	}
}

/*
 * Some rules
 * - A Static Nested Class (SNC) can access all static members of the outer class (even the private ones)
 * - A SNC can have all levels of access applied (public, default, protected, private)
 * - A SNC can be final or abstract
 * - A SNC can extend other classes and implement interfaces
 */
