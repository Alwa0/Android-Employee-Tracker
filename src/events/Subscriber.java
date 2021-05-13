package events;

import model.Employee;

public interface Subscriber {

    void onUpdate(Employee old_state, Employee new_state);
}
