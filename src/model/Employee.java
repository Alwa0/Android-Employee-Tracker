package model;

import events.LocationChangePublisher;

import java.awt.image.BufferedImage;
import java.util.Date;

public class Employee extends User{

    private LocationChangePublisher publisher;
    public GPS_location location;
    public BufferedImage image;
    public long salary;

    public GPS_location getLocation() {
        return location;
    }

    public void setLocation(GPS_location new_location) {
        new_location.setTimestamp(new Date());

        // explicit cloning
        Employee old = new Employee(this.location, this.image, this.salary, this.getPassword(), this.getUsername(), this.getEmail());
        this.location = new_location;
        this.getLocationPublisher().notifySubscribers(old, this);
    }


    public LocationChangePublisher getLocationPublisher() {
        if (publisher == null) this.publisher = new LocationChangePublisher(this);
        return this.publisher;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee() {
        super();
        this.location = null;
        this.image = null;
        this.salary = 0;
    }

    public Employee(GPS_location location, BufferedImage image, long salary, String password, String username, String email) {
        super(password, username, email);
        this.location = location;
        this.image = image;
        this.salary = salary;
    }
}
