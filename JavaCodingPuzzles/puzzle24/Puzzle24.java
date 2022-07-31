package puzzle24;

/*
 * Will this code compile? If yes, what will be the output.
 */


public class Puzzle24 { //syntax is right; we don't have any compilation error in this code

	public static void main(String[] args) {
		int i;
		int count = 0;
		
		for(i = 0; i <= 20; i++) { //inicialize i and count with the value 0; 
				count++; //value of count = 1
				break; //break the for loop
		}
		
		System.out.print(count); //1
		System.out.print(i); //0 

	}

}
