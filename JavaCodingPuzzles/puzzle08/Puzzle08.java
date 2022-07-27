package puzzle08;

/*
 * What will be the output of each statement?
 */
public class Puzzle08 {

	public static void main(String[] args) {
		String str1 = "Hello", str2 = "Java";
		int i = 10, j = 20;
		
		System.out.println(i + j); //30
		
		System.out.println("i + j"); //i + j
		
		System.out.println(str1 + i); // Hello10
		
		System.out.println(str1 + i + j); //Hello1020
		
		System.out.println(i + j + str1); //30Hello
		
		System.out.println(str1 + i * j); //Hello200
		
		System.out.println(str1 + i - j); //Compilation error... trying to use minus operator with a string
		
		System.out.println(str1 + i + j + str2); //Hello1020Java
		

	}

}
/*
 * To solve this puzzle, understand first the priority of the operators:
 * Multiplications has a highest priority than sum, so the program will do Multiplication first.
 * 
 * After, check the associativity of the operator: 
 * if associativity is left to right --> we need to scan left to right and the operator that comes first will
 * be evaluated first;
 * If associativity is right to left <-- then we need to scan in that direction.
 * Note! Most of operators have associativity left to right.
 * 
 * Last, be careful with the plus (+) operator with a string and an integer - because it will be held differently
 * string+string = stringstring -> concatenation
 * string+integer = stringinteger -> again concatenation
 * integer+string = integer+string -> concatenation
 * integer+integer = addition result
 */
