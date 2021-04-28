package model;

import specialization.BackendDeveloper;
import specialization.FrontendDeveloper;
import specialization.PM;
import specialization.Specialization;

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
    public Specialization specialization;

    public Employee(GPS_location location, BufferedImage image, long salary, String password, String username, String email, String specialization) {
        super(password, username, email);
        this.location = location;
        this.image = image;
        this.salary = salary;

        if (specialization.equals("PM")){
            this.specialization = new PM();
        }
        if (specialization.equals("Backend Developer")){
            this.specialization = new BackendDeveloper();
        }
        if (specialization.equals("Frontend Developer")){
            this.specialization = new FrontendDeveloper();
        }
    }
}
