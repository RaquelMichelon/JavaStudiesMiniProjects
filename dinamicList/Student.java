package dinamiclist;

public class Student {
    String name;

    boolean comesAfter(Student student) {
        if(student == null) {
            return false;
        }
         return name.compareTo(student.name) > 0;
    }
}
