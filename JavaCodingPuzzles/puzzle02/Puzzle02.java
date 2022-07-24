package puzzle02;

/*
 * Will this code compile? If yes, what will be the output?
 */


class Test { //there is no compilation error inside this Test class
	int count; //count is an instance variable, and by default its value is zero
	
	Test() {
		count++;
	}
	
	public void printNumber() {
		System.out.println(count);
	}
}

public class Puzzle02 { //there is no compilation error inside this class either

	public static void main(String[] args) {
		Test t1 = new Test(); //Trying to create an object called t1 of Test class and this object that will have one copy of the variable count, which will be incremented by one according with its constructor
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.printNumber(); //Output: 1
		t2.printNumber(); //Output: 1
		t3.printNumber(); //Output: 1

	}

}


/*
 * When the program run, the main method is called and first the constructor of the Test class
 * is called, incrementing the variable count by one and sign this value to t1 variable.
 * Since count is an instance variable, each called that it receive will contain one separate copy of count.
 * 
 */
