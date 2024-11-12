//package Java.week_2.school.management;
//
//import java.util.ArrayList;
//
//public class CourseManager {
//    private ArrayList<Student> students;
//
//    public CourseManager() {
//        this.students = new ArrayList<>();
//    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void displayAllStudents() {
//        if (students != null) {
//            int num = 1;
//            for (Student student : students) {
//                System.out.println("Student #" + num + " -> ");
//                student.displayDetails();
//                System.out.print(" Tuition: " + student.getTuition() + "\n\n");
//                num++;
//            }
//        } else System.out.println("No students enrolled");
//    }
//
//    public void removeStudent(int studentId) {
//        students.removeIf(student -> student.studentId == studentId);
//    }
//
//    //TODO 1
//    public void removeStudentsCourses(int studentId) {
//    }
//
//    //TODO 2
//    public void addStudentsCourses(int studentId) {
//    }
//}