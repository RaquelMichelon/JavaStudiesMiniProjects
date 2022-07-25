package Exceptions;

//CustomException.java
class CustomException {
	public static void main(String[] args) throws AgeLessThanZeroException {
		validateAge(33); 

	}
	
	private static void validateAge(int age) throws AgeLessThanZeroException {
		if (age < 0) {
			throw new AgeLessThanZeroException("Ops! Age less than zero!", new RunTimeException());
		}
	}
}



//AgeLessThanZeroException.java
public class AgeLessThanZeroException extends IllegalArgumentException {
	public AgeLessThanZeroException() {}
	public AgeLessThanZeroException(String message) {
		super(message);
	}
	public AgeLessThanZeroException(Throwable cause) {
		super(cause);
	}
	public AgeLessThanZeroException(String message, Throwable cause) {
		super(message, cause);
	}
}
