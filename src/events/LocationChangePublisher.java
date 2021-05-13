package events;

import model.Employee;
import model.Subscription;
import model.User;

import java.util.LinkedList;
import java.util.List;

public class LocationChangePublisher {

    private final List<Subscriber> subscribers = new LinkedList<>();
    private final Employee employee;

    public LocationChangePublisher(Employee employee) {
        this.employee = employee;
    }

    public void subscribe(Subscriber e) {
        if (!(e instanceof User)) return;
        User user = (User) e;

        // Create sub in DB
        (new Subscription(employee, user)).save();
        subscribers.add(e);
    }

    public void notifySubscribers(Employee oldState, Employee newState) {
        subscribers.forEach(subscriber -> subscriber.onUpdate(oldState, newState));
    }
}
