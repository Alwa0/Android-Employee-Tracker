package registration;

import model.Employee;
import model.Permission;
import model.User;

public class EmployeeRegistrator extends UserRegistrator{

    /**
     * Factory method inheritance override, it is specific to this type of object (Employee)
     * */
    @Override
    public User register(String username, String email, String pass) {
        Employee emp = new Employee(null, null, -1, pass, username, email);
        emp.save();

        Permission permissionCreateGPS = new Permission(emp, "employee.gps.post.own");
        Permission permissionProfileCheck = new Permission(emp, "employee.profile.check.own");
        permissionCreateGPS.save();
        permissionProfileCheck.save();

        System.out.println("EMPLOYEE registered!");
        return emp;
    }

}
