package Java.week_4;

import java.util.ArrayList;

public class Course {
    private String name;
    private int creditHours;
    private ArrayList<Student> students;

    public Course(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public String getCourseName(){
        return name;
    }

    public void listStudents(){
        for (Student student : students){
            System.out.println(student.getStudentName());
        }
    }
}
