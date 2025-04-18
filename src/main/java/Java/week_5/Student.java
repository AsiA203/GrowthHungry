package Java.week_5;

import javax.swing.*;

public class Student {
    private String name;
    private int age;

    public Student (String name, int age) throws Exception {
        if (name == null || name.isEmpty()){
            throw new InvalidNameException("Name cannot be null or empty");
        }

        if (age < 18 || age > 60){
            throw new InvalidAgeException("Age must be between 18 and 60");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
