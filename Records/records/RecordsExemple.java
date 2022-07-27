package records;

public class RecordsExemple {

	public static void main(String[] args) {
		// create a record exact the same way with the class
		StudentRecord studentRecord = new StudentRecord("Raquel", 987);
		
		System.out.println(studentRecord.name()); //to call the name, we don't use getName(), but just name() instead.

		System.out.println(studentRecord); //to check the output using toString()
		
		System.out.println(studentRecord.nameToUpperCase()); //call the instance method of a record
		
		StudentRecord.printSomething(); //call the static method of a record
	}

}
