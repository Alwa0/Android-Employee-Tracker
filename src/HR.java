import java.util.Date;

public class HR extends User{
    public HR(long id, String password, String username, String email) {
        super(id, password, username, email);
    }
    public GPS_location view_location(long id, Date date){
        return null;
    }
    public long check_salary(long id, Date date){
        return 0;
    }
}
