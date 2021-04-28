package model;

public class Team extends TeamComponent implements ORM_Model {
    public TeamComponent[] components;

    public Team(TeamComponent[] components) {
    }

    public void setComponents(TeamComponent[] components) {
        this.components = components;
    }

    public TeamComponent[] getComponents() {
        return components;
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
