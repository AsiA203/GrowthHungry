package Java.week_5;

import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Student> studentsArray = new ArrayList<>();
    private static final int MAX_STUDENTS = 5;

    public void registerStudent(Student student) throws CourseFullException{
        if (studentsArray.size() >= MAX_STUDENTS){
            throw new CourseFullException("Course is full. Cannot register more students");
        }

        studentsArray.add(student);
        System.out.println("Student " + student.getName() + " registered successfully.");
    }

    public int getRegisteredCount() {
        return studentsArray.size();
    }
}
