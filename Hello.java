class Student{
    String name;
    Integer age;

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}

class Hello {
    public static void main(String[] arguments) {
        
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Mary", 21);
        Student student3 = new Student("Peter", 22);

        // Student[] students = {student1, student2, student3};
        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {
            System.out.println(student.name + " is " + student.age + " years old.");
        }
    }
}