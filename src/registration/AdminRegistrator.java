package registration;

import model.Admin;
import model.Employee;
import model.Permission;
import model.User;

public class AdminRegistrator extends UserRegistrator{

    /**
     * Factory method inheritance override, it is specific to this type of object (Employee)
     * */
    @Override
    public User register(String username, String email, String pass) {
        Admin admin = new Admin(pass, username, email);
        admin.save();

        Permission all_perms_on_gps = new Permission(admin, "employee.gps.crud.all");
        Permission all_perms_on_profile = new Permission(admin, "employee.profile.crud.all");
        all_perms_on_gps.save();
        all_perms_on_profile.save();

        System.out.println("ADMIN registered!");
        return admin;
    }

}
