package loops;

/*
 * Write a program which prints the even numbers between 1 and 100 increasing its order and then in an decreasing order
 * use while loop
 */
public class LoopEx02 {
	
	public static void main(String[] args) {
		int i = 1;
    while(i <= 100) {
      if(i%2 == 0) {
        System.out.print(i+ " ");
        i++;
      }
    }
    
    int b = 100;
    while(b >= 1) {
      if(b%2 == 0) {
        System.out.print(b+ " ");
        b--;
      }
    }
		
	}

}
