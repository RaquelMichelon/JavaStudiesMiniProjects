package statics;

public class StaticExamples {

	public static void main(String[] args) {
		//a static method must be accessed by the name of the class.
		Classroom.teacher = "Someone";
		
		Classroom class1 = new Classroom();
		class1.student = "Somebody";
		
		Classroom class2 = new Classroom();
		class2.student = "Another Somebody";
		
		Classroom.teach();
	}

}


//same package - file Classroom.java
//package statics;
public class Classroom {
	String student;
	static String teacher; //just one professor for all students, so using the static the attribute becomes global; It will be only one for all class, for all instances of classroom
	
	//the methods work equally
	static void teach() {
		//static methods only can access static attributes
		System.out.println(teacher + "teaching.");
	}
}
