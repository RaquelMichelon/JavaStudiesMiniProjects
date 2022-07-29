package puzzle15;


/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle15 { //NO COMPILETION ERROR

	public static void main(String[] args) {
		String str1 = "Uhuul, it is Friday!"; //assign the value directly as a string literal
		String str2 = "Uhuul, it is Friday!";
		String str3 = new String("Uhuul, it is Friday!"); //create an object of String
		
		System.out.println(str1 == str2); //true - COMPARE THE MEMORY ADDRESS
		System.out.println(str1.equals(str3)); //true - COMPARE THE VALUE OF TWO STRINGS

	}

}
