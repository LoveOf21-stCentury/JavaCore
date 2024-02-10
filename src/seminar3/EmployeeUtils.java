package seminar3;

import seminar3.comparator.ComparatorByAge;
import seminar3.comparator.ComparatorByName;
import seminar3.comparator.ComparatorBySalary;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeUtils {
    Employee employees[];

    public Employee[] buildEmployee() {
        Employee employee1 = new Employee("Chandler Marruel", 26, 50800, 895684);
        Employee employee2 = new Employee("Ross Geller", 31, 45500, 895684);
        Employee employee3 = new Employee("Matt LeBlanc", 56, 36700, 895684);
        Employee employee4 = new Employee("Monica Geller", 45, 12500, 895684);
        Employee employee5 = new Employee("Phoebe Buffue", 34, 84000, 895684);
        Employee employee6 = new Employee("Rachael Green", 34, 12000, 895684);
        employees = new Employee[]{employee1, employee2, employee3, employee4, employee5, employee6};
        return employees;
    }

    public void upSalary() {
        System.out.println("Before up salary");
        for (Employee employee : employees) {
            System.out.print(employee);
        }
        for (Employee employee : employees) {
            if (employee.getAge() < 40) employee.setSalary(employee.getSalary() + 2000);
        }
        System.out.println("After up salary");
        for (Employee employee : employees) {
            System.out.print(employee);
        }
        System.out.println();
    }

    public void sortBySalary() {
        System.out.println("Before sort by salary");
        for (Employee empl: employees) {
            System.out.print(empl);
        }
        Arrays.sort(employees, new ComparatorBySalary());
        System.out.println("After sort by salary");
        for (Employee empl: employees) {
            System.out.print(empl);
        }
    }
    public void sortByAge() {
        System.out.println("Before sort by age");
        for (Employee empl: employees) {
            System.out.print(empl);
        }
        Arrays.sort(employees, new ComparatorByAge());
        System.out.println("After sort by age");
        for (Employee empl: employees) {
            System.out.print(empl);
        }
    }
    public void sortByName() {
        System.out.println("Before sort by names");
        for (Employee empl: employees) {
            System.out.print(empl);
        }
        Arrays.sort(employees, new ComparatorByName());
        System.out.println("After sort by names");
        for (Employee empl: employees) {
            System.out.print(empl);
        }
    }
}
