package puzzle27;

/*
 * How young am I?
 */
public class Puzzle27 {

	public static void main(String[] args) {
		
		//to solve the expression, think about the priority of the operators
		//after, check the associativity e.g. multiplication and division have associativity left to right -->
		//what appears first will be solved first 
		int num = 8 * 25 / 50 / 4 * 90 * 2 /15 + 18 * 3 - 14 * 3 - 10; //14
		
		//++num will increment first
		if(++num > 30 && ++num < 50 || ++num > 25 && ++num < 40) { //&& has a highest priority and || has a lowest priority 
			//the condition is false, so we will go to else
			System.out.print(num);
		}
		else {
			System.out.print(num * 2 - 4); //16 * 2 - 4 = 28
		}

	}

}

/*
 * When we have the or conditions || , if the first condition is true, 
 * java will not check the second condition.
 * 
 * When we have the and conditions && , if the first condition is false, 
 * java will not check the second condition.
 * 
 * Lets get the following expression in parts:
 * ++num > 30 && ++num < 50 || ++num > 25 && ++num < 40
 * 
 * ++num > 30 && ++num < 50 -> first add one to num and evaluate the condition: 15 > 30 = F 
 * is false, so the second will not be evaluated
 * next
 * ++num > 25 && ++num < 40 -> first ++num, then the condition: 16 > 25 = F
 * again, java will not check for the second condition
 * 
 * the final condition is: F || F = F
 * 
 * the output of this program will be 28;
 * 
 */
