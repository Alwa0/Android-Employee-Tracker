package model;

public class Subscription implements ORM_Model{
    /**
     * Real Implementation of subscriptions inside database
     * */

    private Employee publisher;
    private User subscriber;

    public Subscription(Employee publisher, User subscriber) {
        this.publisher = publisher;
        this.subscriber = subscriber;
    }

    @Override
    public ORM_Model fetch(String id) {
        return this;
    }

    @Override
    public void save() {

    }

    @Override
    public ORM_Model update(String... fields) {
        return this;
    }

    @Override
    public ORM_Model delete(String... fields) {
        return this;
    }
}
