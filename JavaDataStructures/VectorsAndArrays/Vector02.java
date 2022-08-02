package datastructures;

public class Vector02 {
	
	//create an array of String type
	private String[] items;
	
	//create a size attribute
	private int size;
	
	//create a constructor setting the array length
	public Vector01(int capacity) {
		this.items = new String[capacity];
		this.size = 0; 
	}
	
//	public void addItem(String item) {
//		for (int i = 0; i<this.items.length; i++) {
//			if(this.items[i] == null) {
//				this.items[i] = item;
//				break; 
// 			}
//		}
//	}
	
	//Lets optimize the method above
	public void addItem(String item) throws Exception {
		if(this.size < this.items.length) {
			this.items[this.size] = item;
			this.size++;
		} else {
			throw new Exception("Vector is full!");
		}
	}
	
//another option could be returning a boolean
//		public boolean addItem(String item) {
//			if(this.size < this.items.length) {
//				this.items[this.size] = item;
//				this.size++;
//				return true;
//			} 
//			return false;
//
//		}
}





//Test.java
package datastructures;

public class Test {

	public static void main(String[] args) {
		Vector01 myVector = new Vector01(5);
		
		try {
			myVector.addItem("first element");
			myVector.addItem("second element");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}


 
