package model;

import registration.EmployeeRegistrator;
import registration.UserRegistrator;

import java.util.Date;

public class Admin extends User {
    public Admin(String password, String username, String email) {
        super(password, username, email);
    }
    public Admin() {
        super();
    }
    public GPSlocation ViewLocation(long id, Date date){
        return null;
    }
    public long checkSalary(long id, Date date){
        return 0;
    }
    public void addEmployee(User newEmployee){
        UserRegistrator reg = new EmployeeRegistrator();
        reg.register(newEmployee.getUsername(), newEmployee.getEmail(), newEmployee.getPassword());
        // some log about admin action maybe
    }
    public void changePassword(long id, String newPassword){

    }
}
