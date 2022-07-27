package records;

/*
 * Records are useful to create a class that will carrying some data about something.
 * Example if you had a Student class that carry student name and student number, and the Student exists in some db, and 
 * all that class has to do is hold that Student info and return it to the user.
 * 
 * ------------------------------
 * 
 * Before records exist you needed to:
 * 1 create a class;
 * 2 create two private fields to hold name and number; put final if they cannot be modify after being created;
 * 3 create a constructor with those properties;
 * 4 generate getter methods for those field;
 * 5 override toString implementation;
 * 6 override the hashCode method; 
 * 7 override the Equals method into a better implementation to check if one instance is equal to another.
 * 
 * Inside the main method:
 * 1 create the Student class object, passing a name and a number in the constructor.
 * 
 * -------------------------------
 * 
 * HOW TO DO SAME THING USING A RECORD:
 * public record RecordExample(String name, int number) {}
 * 
 * put record instead of class - record is a special type of class
 * inside parentesis, put all elements you would like to hold with this record
 * java will generate private and final fields to that elements by default
 * java also generates getter methods,the difference is that they don't have the word "get" in their names, just the name
 * of the field;
 * also generates a canonical constructor: with all field passed as parameter of the constructor
 * finally generates implementations of toString(), equals() and hashCode()
 * 
 * Records are immutable by default, which means that it not create any setter methods
 * However, you can define your own constructors overriding the canonical one.
 * 
 */


//records cannot extend any other class; by default it implicitly extends the record class;
//records are also implicitly final classes, they can't be extended by other classes;
//You can implement INTERFACES normally
public record StudentRecord(String name, int number) {
	
	//you can create static fields; any not static fields are not allowed
	public static final String DEFAULT_STUDENT_POSITION = "Active";
	
//override the canonical constructor - but it have to have the same parameters in the same order
//it can be useful when some validation is necessary
//	public StudentRecord(String name, int number) {
//		if (number < 0) {
//			throw new IllegalArgumentException("Number can not be negative.");
//		}
//		this.name = name;
//		this.number = number;
//	}
	
	//you can also use the compact constructor instead the one above
	public StudentRecord {
		if (number < 0) {
			throw new IllegalArgumentException("Number can not be negative.");
		}
	}
	
	
	//You can create and call instance methods if you want;
	public String nameToUpperCase() {
		return name.toUpperCase();
	}
	
	//You can also create static methods;
	public static void printSomething() {
		System.out.println("What?");
	}
}
