package Comparable_comparartor;
import java.util.*; // Needed for List, Arrays, Collections

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.name.compareTo(s.name); // Sort by name
        // return Integer.compare(this.id, s.id); // Use this to sort by id
    }

    public String toString() {
        return id + " " + name;
    }
}


public class TestComparable {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
	            new Student(9, "Amit"),
	            new Student(0, "Rahul"),
	            new Student(2, "Kiran")
	        );
	        Collections.sort(list); // Uses Comparable
	        list.forEach(System.out::println);
	    }
	}
