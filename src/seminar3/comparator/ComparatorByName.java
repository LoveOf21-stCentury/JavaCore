package seminar3.comparator;

import seminar3.Employee;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
