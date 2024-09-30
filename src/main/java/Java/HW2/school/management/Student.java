package Java.HW2.school.management;

import Java.HW2.school.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {
    public int studentId;
    private ArrayList<String> enrolledCourses = new ArrayList<>();
    private double tuition;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void enrolledCourses(String [] courses){
        enrolledCourses.addAll(Arrays.asList(courses));
        updateTuition();
    }

    public void enrolledCourses(String course){
        enrolledCourses.add(course);
        updateTuition();
    }

    private void setTuition(double tuition){
        this.tuition = tuition;
    }

    public void updateTuition(){
        //$500 per course
        double updatedTuition = 500 * enrolledCourses.size();
        setTuition(updatedTuition);
    }

    public double getTuition(){
        return tuition;
    }

    public void dropCourse(String course){
        boolean removed = enrolledCourses.removeIf(enrolledCourses -> enrolledCourses.equals(course));
        updateTuition();

        if (!removed){
            System.out.println("Student was not enrolled in " + course + ", thus it can't be removed.");
        }
    }
}