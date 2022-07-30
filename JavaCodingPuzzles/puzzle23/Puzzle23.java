package package23;
/*
 * Will this code compile? If yes, what will be the output.
 */

public class Puzzle23 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 0; i <= 10; i++) {
			if (i % 3 == 0) { //most programmers will start to check this logic first, but before is important to check the sintaxe
				count = 0;
			}
		}
		
		System.out.print(count); 
		System.out.print(i); //variable i is not accessible here, so java will give a compilation error
	}

}



