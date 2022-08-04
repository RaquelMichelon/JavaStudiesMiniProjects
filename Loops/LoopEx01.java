package loops;

/*
 * Write a program which prints the even numbers between 1 and 100 increasing its order and then in an decreasing order
 */
public class LoopEx01 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " "); //2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100  

			}
		}
		
		System.out.println(" ");
		
		for (int i = 100; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " "); //100 98 96 94 92 90 88 86 84 82 80 78 76 74 72 70 68 66 64 62 60 58 56 54 52 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 
			}
		}
		
	}

}
