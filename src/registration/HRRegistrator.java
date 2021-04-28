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

        Permission checkGPS = new Permission(hr, "employee.gps.check");
        Permission checkProfile = new Permission(hr, "employee.profile.check.other");
        Permission someOtherHRPerm = new Permission(hr, "employee.profile.check");

        checkGPS.save();
        checkProfile.save();
        someOtherHRPerm.save();

        System.out.println("HR registered!");
        return hr;
    }
}
