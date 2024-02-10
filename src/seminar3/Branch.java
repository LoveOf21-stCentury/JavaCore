package seminar3;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class Branch extends Organization {
    private Organization organization;
    private List<Employee> emplBranch;

    public Branch(String nameOrg, String address, int empCount) {
        setNameOrg(nameOrg);
        this.setAddress(address);
        this.setEmpCount(empCount);
        emplBranch = new ArrayList<Employee>();
    }
}
