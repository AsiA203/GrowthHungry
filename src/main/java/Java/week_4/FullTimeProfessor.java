package Java.week_4;

public class FullTimeProfessor extends Professor{
    private double monthlySalary;

    public FullTimeProfessor(String name, String department, double monthlySalary) {
        super(name, department);
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
