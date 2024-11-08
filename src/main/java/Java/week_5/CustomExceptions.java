package Java.week_5;

class CourseFullException extends Exception{
    CourseRegistration courseRegistration;
    public CourseFullException(String message) throws Exception{
        super(message);

        if (courseRegistration.getStudentsArray().size() > 5){
            throw new Exception("Course already has 5 students.");
        }
    }
}
