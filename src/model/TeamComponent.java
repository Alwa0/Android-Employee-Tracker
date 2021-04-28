package model;

import java.util.Date;

public abstract class TeamComponent {
    public TeamComponent parent;

    public TeamComponent() {
    }

    public TeamComponent getParent() {
        return parent;
    }

    public void setParent(TeamComponent parent) {
        this.parent = parent;
    }

    public TeamComponent(TeamComponent parent) {
        this.parent = parent;
    }

    public void assignTask(String task, Date deadline) {
        // some method which also intended to be used
    }

    public void pushNotify(String notificationHeader, String notificationBody){
        // some method which calls external service to perform push notification
    }

    public TeamComponent get(){
        return this;
    }

    public void addComponent(TeamComponent component){

    }

    public TeamComponent remove(TeamComponent component){
        return null;
    }
}
