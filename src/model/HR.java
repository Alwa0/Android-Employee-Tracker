package model;

import events.Subscriber;

import java.util.Date;

public class HR extends User implements Subscriber {
    public HR(long id, String password, String username, String email) {
        super(password, username, email);
    }
    public HR() {
        super();
    }
    public GPS_location viewLocation(long id, Date date){
        return null;
    }
    public long checkSalary(long id, Date date){
        return 0;
    }

    @Override
    public void onUpdate(Employee old_state, Employee new_state) {
        // if position changed -> send push notification

        if (old_state.getLocation() == null) return;
        if (new_state.getLocation() == null) return;

        String old_city = old_state.getLocation().getCity();
        String new_city = new_state.getLocation().getCity();

        String push = String.format("Employee '%s' has left the city %s", old_state.getEmail(), old_city);
        if (old_city != null && new_city == null) this.pushNotify("Employee status", push);

        push = String.format("Employee '%s' has arrived to the city %s", old_state.getEmail(), new_city);
        if (old_city == null && new_city != null) this.pushNotify("Employee status", push);

    }
}
