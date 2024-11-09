package Java.week_5;

class CustomExceptions extends Exception{

    public void InvalidAgeException() extends {

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
