package Java.week_2.school;

public class Person {
    public String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name + ", Age:" + this.age);
    }

    public String getStudentName(){
        return name;
    }
}