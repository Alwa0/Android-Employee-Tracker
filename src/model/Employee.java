package model;

import java.awt.image.BufferedImage;

public class Employee extends User{
    public GPS_location getLocation() {
        return location;
    }

    public void setLocation(GPS_location location) {
        this.location = location;
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

    public GPS_location location;
    public BufferedImage image;
    public long salary;

    public Employee() {
        super();
        this.location = null;
        this.image = null;
        this.salary = 0;
    }

    public Employee(GPS_location location, BufferedImage image, long salary, String password, String username, String email, String specialization) {
        super(password, username, email);
        this.location = location;
        this.image = image;
        this.salary = salary;
    }
}
