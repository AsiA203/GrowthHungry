package Java.week_4;

import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Professor> professors;
    ArrayList<Course> courses;

    public Department(String departmentName) {
        this.name = departmentName;
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getDepartmentName() {
        return name;
    }

    public void listProfessors() {
        for (Professor professor : professors) {
            System.out.println("Professor: " + professor.getName());
        }
    }

    public void listCourses() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }
}
