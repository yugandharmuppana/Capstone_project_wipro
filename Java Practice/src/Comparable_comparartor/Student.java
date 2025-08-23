package Comparable_comparartor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sort by name
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student(9, "Amit"),
            new Student(0, "Rahul"),
            new Student(2, "Kiran")
        );

        System.out.println("Before Sorting: " + list);

        Collections.sort(list);  // Uses compareTo (sort by name)

        System.out.println("After Sorting by name: " + list);
    }
}
