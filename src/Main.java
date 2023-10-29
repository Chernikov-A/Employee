public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new EmployeeFreelancer("Ivanov", 100);
        employees[1] = new EmployeeFreelancer("Petrov", 120);
        employees[2] = new EmployeeWorker("Sidorov", 5000);
        employees[3] = new EmployeeWorker("Kuznetsov", 7000);

        EmployeeArray employeeArray = new EmployeeArray(employees);

        employeeArray.sortByName();
        System.out.println("Sorted by name:");
        employeeArray.print();
        employeeArray.sortByAverageSalary();
        System.out.println("Sorted by average salary");
        employeeArray.print();
    }
}