import java.util.Arrays;
import java.util.Comparator;

public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }

    public void sortByName(){
        Arrays.sort(employees, Comparator.comparing(Employee::getName));
    }
    public void sortByAverageSalary(){
        Arrays.sort(employees, Comparator.comparing(Employee::getName));
    }

    public void print(){
        for (Employee employee: employees){
            System.out.println("Name: " + employee.getName() + ", Average salary: " + employee.calculateAverageSalary());
        }
    }
}
