package dinamiclist;

public class AdvancedAlgorithm {
    public static void main(String[] args) {

        StudentsList list = new StudentsList();

        Student student1 = new Student();
        student1.name = "Raquel";
        list.addToList(student1);

        Student student2 = new Student();
        student2.name = "Carlos";
        list.addToList(student2);

        Student student3 = new Student();
        student3.name = "Sarah";
        list.addToList(student3);

        Student student4 = new Student();
        student4.name = "Vitória";
        list.addToList(student4);

        //list iteration
        iterate(list);

        //remove student
        list.remove(student3);
        iterate(list);

        list.order();
        iterate(list);

    }

    static void iterate(StudentsList studentList) {
        for (int i = 0; i < studentList.length; i++) {
            Student s1 = studentList.getStudent(i);
            if (s1 != null) {
                System.out.println(s1.name);
            }
        }
        System.out.println();
    }

}
