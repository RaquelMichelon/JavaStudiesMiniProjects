package Exceptions;

/*
 * How to create custom exceptions
 */

/*
 * 1 - create a new class to the custom exception - it is a convention that the name is descriptive and ends with the word exception
 * 2 - extends Exception
 * 3 - throw the exception when is necessary and add "throws" to the methods signature
 * DONE!
 * 
 * NOTE!!!! 
 * if the exception extends from a RunTimeException, it will be one unchecked exception,
 * so you don't have to have the throws declarations in the methods.
 */

//CustomException.java
class CustomException {
	public static void main(String[] args) throws AgeLessThanZeroException {
		validateAge(33); 

	}
	
	//SITUATION 1 - VALIDATE AN AGE
	private static void validateAge(int age) throws AgeLessThanZeroException {
		//is that negative?
		if (age < 0) {
			//instead of throw a generic exception, lets customize one
			throw new AgeLessThanZeroException();
		}
	}
}

//AgeLessThanZeroException.java
public class AgeLessThanZeroException extends Exception {

}

/*
 * How to make it in a more useful exception
 * if (age < 0) {
 * 			1 - PASS A PARAMETER HERE
			throw new AgeLessThanZeroException("print some custom message");
		}
 * 
 * TO DO THAT, YOU WILL NEED TO PUT A CONSTRUCTOR ON THE EXCEPTION:
 * 
 * //AgeLessThanZeroException.java
	public class AgeLessThanZeroException extends Exception {
	
		public AgeLessThanZeroException() {}
		
		public AgeLessThanZeroException(String message) {
			super(message);
		}
		//you can add a third constructor that takes a throwable as a parameter when the exception created can be
			caused by another exception
			
		public AgeLessThanZeroException(Throwable cause) {
			super(cause);
		}
		
	}
	
	-----
	if (age < 0) {
			throw new AgeLessThanZeroException(new RunTimeException());
		}
		
	-----
	
	//AgeLessThanZeroException.java
	public class AgeLessThanZeroException extends Exception {
	
		public AgeLessThanZeroException() {}
		public AgeLessThanZeroException(String message) {
			super(message);	
		}
		public AgeLessThanZeroException(Throwable cause) {
			super(cause);
		}
		
		//you can add a fourth constructor that takes both a throwable and a string as parameter
		public AgeLessThanZeroException(String message, Throwable cause) {
			super(message, cause);
		}
	}
	
		-----
		
	if (age < 0) {
			throw new AgeLessThanZeroException("Age less than zero!", new RunTimeException());
		}
		
	-----
	
	INSTEAD OF EXTEND FROM A SUCH GENERIC EXCEPTION, lets extends from a near one exception: 
	public class AgeLessThanZeroException extends IllegalArgumentException {}
	
 * 
 */
