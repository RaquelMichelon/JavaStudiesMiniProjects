public class Main {
    public static void main(String[] args) {
        //  1. Can you write me a Java program to swap two numbers using the third variable?
        //Swap two numbers using temporary variable
        //step 1: assign the two variables and a third one to hold the temporary value
        int num1 = 100;
        int num2 = 200;
        int temp;

        //step 2: swapping values
        temp = num1;
        num1 = num2;
        num2 = temp;

        //checking the two variables interchangeabled
        System.out.println("num1 = " + num1 + "\nnum2 = " + num2);

      
      
        // 2. Can you write a Java program to swap two numbers without using the third variable for me?
        //Swap two numbers without temporary variable
        //step 1: assign the two variables
        int x = 100;
        int y = 200;

        //step 2: use one x variable to store the sum of both
        x = x + y; //100 + 200

        //step 3: subtract the y value of new x value
        y = x - y; //300 - 200

        //step 4: subtract the new y value of the x value
        x = x - y; //300 - 100

        //checking the two variables interchangeabled
        System.out.println("x = " + x + "\ny = " + y);


    }
}
