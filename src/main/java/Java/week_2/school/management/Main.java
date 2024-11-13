package Java.week_2.school.management;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 21, 1);
        Student student2 = new Student("Emily", 22, 2);
        Student student3 = new Student("Leah", 23, 3);

//        student1.enrolledCourses(new String[]{"Math", "English"});
//        student2.enrolledCourses(new String[]{"Art", "English"});
//        student3.enrolledCourses(new String[]{"Chemistry", "English"});
//
//        student1.enrolledCourses("History");
//        student2.enrolledCourses("History");
//        student3.enrolledCourses("History");
//
//        System.out.println("John's Tuition: " + student1.getTuition());
//        System.out.println("Emily's Tuition: " + student2.getTuition());
//        System.out.println("Leah's Tuition: " + student3.getTuition());

        System.out.println("_________________________________________");
        Java.week_2.school.management.CourseManager courseManager = new Java.week_2.school.management.CourseManager();
        courseManager.addStudent(student1);
        courseManager.addStudent(student2);
        courseManager.addStudent(student3);

//        courseManager.displayAllStudents();

        System.out.println("Removing Student named Emily by studentId");
        System.out.println("_________________________________________");
        courseManager.removeStudent(2);
//        courseManager.displayAllStudents();


        System.out.println("Removing Course from Student Leah");
        System.out.println("_________________________________________");
//        student3.dropCourse("History");
//        courseManager.displayAllStudents();
    }
}