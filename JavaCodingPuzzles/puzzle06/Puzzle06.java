package puzzle06;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle06 {
	
	//main is a static method, so we can only access static members, which means that
	//the method fun() has to be static in order to not have a compilation error 
	public static void main(String[] args) {
		System.out.println(fun());
	}
	
	static int fun() {
		//will give a compilation error - local variables cannot be static or use the access specifier: public, private, protected
		//this variable cannot be abstract 
		//there is only one keyword allowed uses here: final
		static int x = 0; //the scope of this variable is only the function fun(), it is a local variable, which means that it not accept static word
		return ++x;
	}

}
