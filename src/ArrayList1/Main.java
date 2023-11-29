package ArrayList1;

import java.util.ArrayList;

public class Main {
    private static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int n = 4;

        studentList.add(new Student("Carmen", 30));
        studentList.add(new Student("Nicola", 32));
        studentList.add(new Student("Maria", 10));
        studentList.add(new Student("Andrea", 23));

        System.out.println("List");
        printStudentList(studentList);

        for (int i = 0; i < n; i++) {
            String name = "Student" + (i + 1);
            int age = 18 + i;
            studentList.add(new Student(name, age));
        }

        System.out.println("\nList updated");
        printStudentList(studentList);
    }
}