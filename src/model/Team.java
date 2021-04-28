package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Team extends TeamComponent implements ORM_Model {

    private long id;
    public List<TeamComponent> components;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Team(List<TeamComponent> components) {
        this.components = components;
    }

    public Team() {
        this.components = new ArrayList<>();
    }

    public void setComponents(List<TeamComponent> components) {
        this.components = components;
    }

    public List<TeamComponent> getComponents() {
        return components;
    }

    public void pushNotify(String notificationHeader, String notificationBody){
        // some method which calls external service to perform push notification
        System.out.printf("SENT NOTIFICATION TO TEAM WITH ID: %d\n", this.id);
    }

    @Override
    public Team fetch(String id) {
        // some smart sql
        this.setId(Integer.parseInt(id));
        return this;
    }

    @Override
    public void save() {
        // some smart sql
    }

    @Override
    public ORM_Model update(String... fields) {
        // some smart sql
        return this;
    }

    @Override
    public ORM_Model delete(String... fields) {
        // some smart sql
        return this;
    }
}
