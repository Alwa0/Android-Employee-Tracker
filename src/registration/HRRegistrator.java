package registration;

import model.HR;
import model.Permission;
import model.User;

public class HRRegistrator extends UserRegistrator{
    /**
     * Factory method inheritance override, it is specific to this type of object (HR)
     * */
    @Override
    public User register(String username, String email, String pass) {
        HR hr = new HR(1, pass, username, email);
        hr.save();

        // actual db interaction

        Permission check_gps = new Permission(hr, "employee.gps.check");
        Permission check_profile = new Permission(hr, "employee.profile.check.other");
        Permission some_other_hr_perm = new Permission(hr, "employee.profile.check");

        check_gps.save();
        check_profile.save();
        some_other_hr_perm.save();

        System.out.println("HR registered!");
        return hr;
    }
}
