package model;

import registration.EmployeeRegistrator;
import registration.UserRegistrator;

import java.util.Date;

public class Admin extends User {
    public Admin(String password, String username, String email) {
        super(password, username, email);
    }
    public GPS_location view_location(long id, Date date){
        return null;
    }
    public long check_salary(long id, Date date){
        return 0;
    }
    public void add_employee(User new_employee){
        UserRegistrator reg = new EmployeeRegistrator();
        reg.register(new_employee.getUsername(), new_employee.getEmail(), new_employee.getPassword());
        // some log about admin action maybe
    }
    public void change_password(long id, String new_password){

    }
}
