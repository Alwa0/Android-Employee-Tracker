package model;

import java.util.Date;

public class TeamComponent {
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

    public void assignTask(String task, Date deadline){

    }

    public void pushNotify(String notificationHeader, String notificationBody){

    }

    public TeamComponent get(){
        return null;
    }

    public void addComponent(TeamComponent component){

    }

    public TeamComponent remove(TeamComponent component){
        return null;
    }
}
