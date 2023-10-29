public class EmployeeFreelancer extends Employee {
    private double hourlyRate;
    public EmployeeFreelancer(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAverageSalary() {
        return 20.8 * 8 * hourlyRate;
    }
}
