package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team extends TeamComponent implements ORMmodel {

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

    public void addComponent(TeamComponent component){
        this.components.add(component);
    }

    @Override
    public TeamComponent remove(TeamComponent component) {
        this.components.remove(component);
        return this;
    }

    public void pushNotify(String notificationHeader, String notificationBody){
        // some method which calls external service to perform push notification
        System.out.printf("SENDING NOTIFICATION TO TEAM WITH ID: %d, %d members inside\n", this.id, components.size());
        this.components.forEach(teamComponent -> {teamComponent.pushNotify(notificationHeader, notificationBody);});
    }

    public void assignTask(String task, Date deadline) {
        // some method which also intended to be used
        System.out.printf("ASSIGNED TASK TO TEAM WITH ID: %d, %d members inside\n", this.id, components.size());
        this.components.forEach(teamComponent -> {teamComponent.assignTask(task, deadline);});
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
    public ORMmodel update(String... fields) {
        // some smart sql
        return this;
    }

    @Override
    public ORMmodel delete(String... fields) {
        // some smart sql
        return this;
    }
}
