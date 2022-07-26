package codeperformance;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class JavaCodePerformance {

	public static void main(String[] args) {
		/*
		 * Strings - Use method 1 over method 2
		 */
		//method one - will use the same string literal from the heap
		String s = "This is a String.";
		//method two - it will always create a new object
		String s2 = new String("This is a String.");
		
		
		
		/*
		 * Empty Strings Comparisons - Use method 2 over method 1
		 */
		//method one - equals() has different checks and cycles
		boolean empty = s.equals("");
		//method two - don't waste too much computer resource
		boolean empty2 = s.length() == 0;
		
		boolean empty3 = s.isBlank(); //best method
		
		
		/*
		 * Avoid boxing and unboxing - Use method 2 over method 1
		 */
		// rmethod one - eturn int type to avoid unecessary boxing
		public Integer calSum(int n1, int n2);
		//method two - 
		public int calcSum(int n1, int n2);

		
		
		/*
		 * Underscore between numbers 
		 */
		//method one - the readability increases
		int value = 78_667_15;
		//NOTE!  Do not use it with String that will be parse to a number.
		

		
		/*
		 * ArrayList X Vector - Use method 1 over method 2
		 */
		// method one - not synchronized 
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(1, 2, 3));
		//method two - synchronized
		Vector<Integer> vector = new Vector<>(Arrays.asList(1, 2, 3));
		
		
		/*
		 * Avoid unnecessary conditions with Boolean  - Use method 2 over method 1
		 */
		// method one - 
		boolean isValid = false;
		if (user.getAuth().equals(current.getAuth)) {
			isValid = true;
		}
		//method two - 
		Boolean isValid = user.getAuth().equals(current.getAuth);
		
		
		
		/*
		 * Login using lambda - Use method 2 over method 1
		 */
		// method one - 
		Logger logger = Logger.getLogger(CurrentClass.class.getName());
		logger.log(Level.INFO, "Info log");
		//method two - faster and without blocking code
		Logger logger = Logger.getLogger(CurrentClass.class.getName());
		logger.log(Level.INFO, () -> "Info log");

		
		
		/*
		 * Avoid unnecessary method calls repetition  - Use method 2 over method 1
		 */
		// method one - 
		for (int x = 0; x < itemList.size(); x++) {}
		//method two - 
		int size = itemList.size();
		for (int x = 0; x < size; x++) {}
		
		
		
		
		/*
		 * Try with resources statement  - Use method 2 over method 1
		 */
		// method one - 
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("name.txt"));
			while(scanne.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		//method two - the resource is closed implicitly
		try (Scanner scanner = new Scanner(new File("name.txt"))) {
			while(scanne.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		
		
		/*
		 * Use Streams  - Use method 2 over method 1
		 */
		// method one - 
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> resultList = new ArrayList<>();
		int count = 1;
		for (Integer item : list) {
			if (item % 2 == 0) {
				item = item * 2;
				if (count != 1) {
					resultList.add(item);
				}
				count ++;
			}
		}
		//method two - 
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> resultList = list.stream()
				.filter(item -> item % 2 == 0)
				.map(item -> item * 2)
				.skip(1)
				.collect(Collectors.toList());

	}

}
