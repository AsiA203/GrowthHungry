package Java.week_4;

public class UniversitySystem {
    public static void main(String[] args) {
        // Create departments
        Department department = new Department("Computer Science");

        // Create professors
        FullTimeProfessor profSmith = new FullTimeProfessor("Dr. John Smith", "Computer Science", 5000);
        AdjunctProfessor profBrown = new AdjunctProfessor("Dr. Mary Brown", "Math", 3);

        // Add professors to the department
        department.addProfessor(profSmith);
        department.addProfessor(profBrown);

        // Create courses
        Course javaCourse = new Course("Java Programming", 3);
        Course dsCourse = new Course("Data Structures", 4);

        // Add courses to the department
        department.addCourse(javaCourse);
        department.addCourse(dsCourse);

        // Create students
        Student student1 = new Student("Jane Doe", 20, 101);
        Student student2 = new Student("Mark Lee", 21, 102);

        // Register students for courses
        javaCourse.addStudent(student1);
        dsCourse.addStudent(student2);

        // Assign grades
        student1.addGrade(javaCourse, 90);
        student2.addGrade(dsCourse, 85);

        // Print professor list and student grade report
        department.listProfessors();
        student1.printGradeReport();
        student2.printGradeReport();
    }
}
