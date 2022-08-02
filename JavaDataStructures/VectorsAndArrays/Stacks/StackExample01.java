package datastructures;

import java.util.Stack;

/*
 * stack is a LIFO data structure -> Last-In First-Out
 * stores objects into a sort of "vertical tower"
 * push() to add to the top
 * pop() to remove from the top
 * 
 * 
 * Uses of stack:
 * - Undo/redo features in text editors;
 * - Moving back/forward through browser history;
 * - backtracking algorithms; (maze, file directory);
 * - calling functions (call stack)
 */

public class StackExample01 {

	public static void main(String[] args) {
		// 1 declare and instantiate a stack
		Stack<String> stack = new Stack<String>();
		
		//there are 5 unique methods available push(), pop(), empty(), peek(), search()
		
		System.out.println(stack.empty()); //true
		
		//add items
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("Final Fantasy");
		
		System.out.println(stack.empty()); //false
		
		System.out.println(stack); //[Minecraft, Skyrim, Final Fantasy]
		
		//remove always the top object from the stack; return an object
		stack.pop();
		System.out.println(stack); //[Minecraft, Skyrim]
		
		String myFavoriteGame = stack.pop();
		System.out.println(myFavoriteGame); //Skyrim
		System.out.println(stack); //[Minecraft]
		
		
		//get without remove: peek()
		String MyOtherFavGame = stack.peek();
		System.out.println(myFavoriteGame); //Minecraft
		System.out.println(stack); //[Minecraft]
		
		//add again
		stack.push("Skyrim");
		stack.push("Final Fantasy");
		
		//to search for an object; it returns the position of the object
		System.out.println(stack.search("Final Fantasy")); //1 -> is the most top
		System.out.println(stack.search("Skyrim")); //2 -> position 2 from the top
		System.out.println(stack.search("SomeOther")); //-1 -> not found
		
		//create a stack using for
		for (int i = 0; i < 100; i++) {
			stack.push("Minecraft"); //can get an error: out of memory
		}

		
	}

}
