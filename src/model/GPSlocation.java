package model;

import java.util.Date;

public class GPSlocation implements ORMmodel {
    private double latitude;
    private double longitude;
    private Date timestamp;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public GPSlocation(double latitude, double longitude, Date timestamp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
    }

    @Override
    public ORMmodel fetch(String id) {
        return new User("qwerty", "username", "email@gmail.com");
    }

    @Override
    public void save() {
        // some smart sql
    }

    @Override
    public ORMmodel update(String... fields) {
        // some smart sql
        return null;
    }

    @Override
    public ORMmodel delete(String... fields) {
        // some smart sql
        return null;
    }
}
