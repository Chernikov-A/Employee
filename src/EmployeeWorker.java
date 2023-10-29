public class EmployeeWorker extends Employee{
    private double fixedMonthlyPayment;
    public EmployeeWorker(String name,double fixedMonthlyPayment) {
        super(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculateAverageSalary() {
        return fixedMonthlyPayment;
    }
}
