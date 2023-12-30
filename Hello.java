import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

class Hello {
    public static void main(String[] arguments) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.sort(Collections.reverseOrder());
        System.out.println(list);

        list.sort((a, b) -> b - a);
        System.out.println(list);

        list.sort((a, b) -> a - b);
        System.out.println(list);



        List<Student> students = new ArrayList<Student>();

        for (int i = 0; i < 10; i++) {
            students.add(new Student(i, "Student " + i));
        }

        students.sort((a, b) -> b.marks - a.marks);

        for (Student student : students) {
            System.out.println(student.name + " " + student.marks);
        }
    }
}
