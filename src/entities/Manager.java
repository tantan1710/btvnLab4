package entities;

public class Manager extends Staff{
    private double responsibilitySalary;

    public Manager( String name, double salary, double responsibilitySalary) {
        super(name, salary);
        this.responsibilitySalary = responsibilitySalary;
    }

    public double getResponsibilitySalary() {
        return responsibilitySalary;
    }

    public void setResponsibilitySalary(double responsibilitySalary) {
        this.responsibilitySalary = responsibilitySalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "responsibilitySalary=" + responsibilitySalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
