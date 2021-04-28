package model;

import java.util.Date;

public class HR extends User{
    public HR(long id, String password, String username, String email) {
        super(password, username, email);
    }
    public GPS_location viewLocation(long id, Date date){
        return null;
    }
    public long checkSalary(long id, Date date){
        return 0;
    }
}
