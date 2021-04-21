import java.util.Date;

public class Admin extends User{
    public Admin(long id, String password, String username, String email) {
        super(id, password, username, email);
    }
    public GPS_location view_location(long id, Date date){
        return null;
    }
    public long check_salary(long id, Date date){
        return 0;
    }
    public void add_employee(User new_employee){

    }
    public void change_password(long id, String new_password){

    }
}
