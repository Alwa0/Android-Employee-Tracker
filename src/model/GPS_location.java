package model;

import java.util.Date;

public class GPS_location implements ORM_Model {
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

    public GPS_location(double latitude, double longitude, Date timestamp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
    }

    public String getCity() {
        // just example, nothing about real GPS
        if (this.longitude > 100) return "Moscow";
        if (this.longitude > 300) return "Kaliningrad";
        return null; // null if suburb
    }

    @Override
    public ORM_Model fetch(String id) {
        return new User("qwerty", "username", "email@gmail.com");
    }

    @Override
    public void save() {
        // some smart sql
    }

    @Override
    public ORM_Model update(String... fields) {
        // some smart sql
        return null;
    }

    @Override
    public ORM_Model delete(String... fields) {
        // some smart sql
        return null;
    }
}
