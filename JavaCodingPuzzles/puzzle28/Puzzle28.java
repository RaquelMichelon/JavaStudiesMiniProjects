package puzzle28;

/*
 * Will this code compile? If yes, what will be the output?
 */
public class Puzzle28 { 

	public static void main(String[] args) {
 
		int i = 8 * 25 / 50 / 2 * 90 * 2 /15;  //* and / are operators with the same priority and the direction of associativity is left to right.
		//i=24
		if(++i > 10 || ++i < 100) { //if the first condition is true, java will not check the second one
			System.out.print(i); //i=25 ; java checked the first condition and jumped the second
		}
		else {
			System.out.print(i * 2 / 10); 
		}

	}

}

/*
 * There is no compilation error in this program. 
 */
