package collectors;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student {
    String name;
    char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Amit", 'A'));
        students.add(new Student("Rahul", 'B'));
        students.add(new Student("Priya", 'A'));
        students.add(new Student("Neha", 'C'));
        students.add(new Student("Rohit", 'B'));
        students.add(new Student("Anjali", 'A'));
        students.add(new Student("Vikas", 'C'));
        students.add(new Student("Karan", 'B'));
        students.add(new Student("Sneha", 'A'));
        students.add(new Student("Pooja", 'C'));

        System.out.println(students.stream().collect(Collectors.groupingBy(s->s.grade, Collectors.mapping(s->s.name, Collectors.toList()))));
    }
}
