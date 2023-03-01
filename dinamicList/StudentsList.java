package dinamiclist;

public class StudentsList {
    static final int LIST_LENGTH = 1;

    Student[] list = new Student[LIST_LENGTH];

    int length = 0;

    void addToList(Student student) {
        if (list.length == length) {
            Student[] list2 = new Student[LIST_LENGTH + list.length];
            //for to copy old records for the new list
            for (int i = 0; i < list.length; i++) {
                list2[i] = list[i];
            }

            list = list2;
        }

        list[length] = student;
        length++;

    }

    Student getStudent(int position) {
       return list[position];
    }

    int getLength() {
        return length;
    }

    void remove(Student student) {
        for (int i = 0; i < length; i++) {
            Student s = list[i];

            if(s != null && s.equals(student)) {
                //remove student
                remove(i);
                break;
            } else if (s == null && student == null) {
                remove(i);
                break;
            }
        }
    }

    void remove(int index) {
        int initialIndex = index + 1;

        for (int i = initialIndex ; i < length; i++) {
            list[i - 1] = list[i];
        }

        length--;

        list[length] = null;
    }

    void order() {
        for(int i = 1; i < length; i++) {
            Student currentPosition = list[i];
            int basePositionIndex = i;

            while (basePositionIndex > 0) {
                int previousPositionIndex = basePositionIndex - 1;
                Student previousPosition = list[previousPositionIndex];

                if (previousPosition == null || previousPosition.comesAfter(currentPosition)) {
                    list[basePositionIndex] = list[previousPositionIndex];

                    basePositionIndex--;
                } else {
                    break;
                }
            }

            list[basePositionIndex] = currentPosition;
        }
    }

}
