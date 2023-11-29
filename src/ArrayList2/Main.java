package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Alice", 20));
    studentList.add(new Student("Anna", 22));
    studentList.add(new Student("Carlo", 21));
    studentList.add(new Student("Davide", 23));
    studentList.add(new Student("Eva", 19));
    studentList.add(new Student("Francesca", 24));
    studentList.add(new Student("Gioia", 25));
    studentList.add(new Student("Luca", 18));
    studentList.add(new Student("Giovanni", 22));
    studentList.add(new Student("Giacomo", 21));
    studentList.add(new Student("Caterina", 20));
    studentList.add(new Student("Leonardo", 23));

    System.out.println("Lista iniziale:");
    printStudentList(studentList);

    Collections.sort(studentList, Comparator.comparingInt(Student::getAge));

    System.out.println("\nLista ordinata per età:");
    printStudentList(studentList);
}
    private static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
