package seminar3;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String nameOrg;
    private String address;
    private int empCount;
    private Employee manager;

    public Organization(String nameOrg, String address,
                        int empCount, Employee manager) {
        this.nameOrg = nameOrg;
        this.address = address;
        this.empCount = empCount;
        this.manager = manager;
    }

    public Organization(String nameOrg, String address,
                        int empCount) {
        this.nameOrg = nameOrg;
        this.address = address;
        this.empCount = empCount;
    }

    public Organization() {

    }

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "nameOrg='" + nameOrg + '\'' +
                ", address='" + address + '\'' +
                ", empCount=" + empCount +
                ", manager=" + manager +
                '}';
    }
}