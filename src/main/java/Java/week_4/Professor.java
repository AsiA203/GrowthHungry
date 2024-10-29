package Java.week_4;

public abstract class Professor {
    private String name;
    private String department;

    void teachCourse(){
        System.out.println(name + " is teaching in the " + department + " department.");
    }

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract double calculateSalary();
}
