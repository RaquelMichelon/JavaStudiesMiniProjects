package datastructures;

public class Vector01 {
	
	//create an array of String type
	private String[] items;
	
	//create a constructor setting the array length
	public Vector01(int capacity) {
		this.items = new String[capacity];
	}
	
	//create a method to add item into the vector
	public void addItem(String item) {
		for (int i = 0; i<this.items.length; i++) {
			//the vector is inicialized as null by default
			if(this.items[i] == null) {
				this.items[i] = item;
				break; //to stop execution in the first null position
 			}
		}
	}

}


//Test.java
package datastructures;

public class Test {

	public static void main(String[] args) {
		// declare a vector 
		Vector01 myVector = new Vector01(5); //[null, null, null, null, null]
		
		myVector.addItem("first element");
		myVector.addItem("second element");
		//["first element", "second element", null, null, null]	
	}

}
