package Java.week_4;

import Java.week_2.school.Person;

import java.util.HashMap;

public class Student extends Person {
    public int studentId;
    private HashMap<Course, Integer> grades;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.grades = new HashMap<>();
    }

    public void addGrade(Course course, int grade) {
        grades.put(course, grade);
    }


    public String getStudentName() {
        return name;
    }


    public void printGradeReport() {
        System.out.println("Grade Report for " + name);
        for (Course course : grades.keySet()) {
            System.out.println("Course: " + course.getCourseName() + ", Grade: " + grades.get(course));
        }
    }
}