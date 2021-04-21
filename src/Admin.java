import java.util.Date;

public class Admin extends User{
    public Admin(long id, String password, String username, String email) {
        super(id, password, username, email);
    }
    public GPS_location view_location(long id, Date date){
        return null;
    }
}
