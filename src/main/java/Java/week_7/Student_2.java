package Java.week_7;

public class Student_2 {
    private int id;
    private String name;
    private double grade;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getGrade(){
        return this.grade;
    }

    @Override
    public String toString() {
        return "Student | Id: " + getId() + ", Name: " + getName() + ", Grade: " + getGrade();
    }
}
