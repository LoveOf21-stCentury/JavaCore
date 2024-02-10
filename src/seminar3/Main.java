package seminar3;

import seminar3.comparator.ComparatorBySalary;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeUtils employeeUtils = new EmployeeUtils();
        employeeUtils.buildEmployee();
//        employeeUtils.upSalary();
        employeeUtils.sortBySalary();
        System.out.println();
        employeeUtils.sortByName();
        System.out.println();
        employeeUtils.sortByAge();


        Organization org = new Organization("Big Company", "New York", 200);
        Branch north = new Branch("north Branch", "Manhattan", 150);
        Branch south = new Branch("south Branch", "Brooklyn", 50);
        Branch east = new Branch("east Branch", "Texas", 25);

//        System.out.println(org);
//        System.out.println(north);
//        System.out.println(south);
//        System.out.println(east);
    }
}
