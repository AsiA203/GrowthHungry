package Java.week_5;

import javax.swing.*;

public class Student {
    private String name;
    private int age;

    public Student (String name, int age) throws Exception {
        this.name = name;
        this.age = age;

        if (name == null || age < 18 || age > 60){
            throw new Exception("Invalid Input");
        }
    }

    //Custom exception
    public void InvalidAgeException() throws Exception {
        if (age < 18 || age > 60){
            throw new Exception("Invalid Age Exception");
        }
    }

    public void InvalidNameException() throws Exception{
        if (name == null || name.equals("")){
            throw new Exception("Invalid Name Exception");
        }
    }
}
