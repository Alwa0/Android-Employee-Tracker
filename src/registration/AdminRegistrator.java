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

        Permission allPermsOnGps = new Permission(admin, "employee.gps.crud.all");
        Permission allPermsOnProfile = new Permission(admin, "employee.profile.crud.all");
        allPermsOnGps.save();
        allPermsOnProfile.save();

        System.out.println("ADMIN registered!");
        return admin;
    }

}
