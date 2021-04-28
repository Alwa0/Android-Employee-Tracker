package model;

public class Team extends TeamComponent implements ORM_Model {
    public TeamComponent[] components;
    public Team(String password, String username, String specialization){

    }

    @Override
    public ORM_Model update(String... fields) {
        return null;
    }

    @Override
    public ORM_Model delete(String... fields) {
        return null;
    }

    @Override
    public void save() {

    }
}
