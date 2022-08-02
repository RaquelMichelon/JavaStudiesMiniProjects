package statics;

/*
 * The keyword static can be used with:
 * variable: static int a = 1;
 * 
 * block: 
 * static {
 * 		//code here
 * }
 * 
 * method: 
 * public static void methodName() {
 * 		//code here
 * }
 * 
 * Inner Class:
 * class Outer {
 * 		public static class NestedInnerClass {
 * 			//code here
 * 		}
 * }
 * 
 * NOTE! static keyword doesn't work with abstract keyword because when we use the abstract, it's implementation is provided in
 * other class. And static means that something belongs to a class.
 */

public class MainMethodExplained {
	// the main method will be called by the Java Runtime Environment to trigger the program to run
	public static void main(String[] args) {
		
		// Java will do something like this:
		//MainMethodExplained.main(args);
		
		//public: the main method should be callable by something outside its class.
		//static: you can run it without need an instance of its class, but by the class directly;
		//void: this is the return type
		//main: it is just the way it is; you can not call anything else... sorry.
		//String[] args: the arguments passed are an array of Strings
		
		//System.out.println(args[0]);
		//javac MainMethodExplained.java ->to compile by the terminal
		//java MainMethodExplained HoldMyArgument ->to run by terminal passing an argument

	}

}
