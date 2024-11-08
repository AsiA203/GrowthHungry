package Java.week_5;

class CustomExceptions extends Exception{
    Student student;
    CourseRegistration courseRegistration;

    public void InvalidAgeException() throws Exception {
        if (student.getAge() < 18 || student.getAge() > 60){
            throw new Exception("Invalid Age Exception");
        }
    }

    public void InvalidNameException() throws Exception{
        if (student.getName() == null || student.getName().equals("")){
            throw new Exception("Invalid Name Exception");
        }
    }

    public void CourseFullException() throws Exception{
        if (courseRegistration.getStudentsArray().size() > 5){
            throw new Exception("Course already has 5 students.");
        }
    }
}
