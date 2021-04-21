package model;

public class Session implements ORM_Model {
    private long id;
    private String token;
    private String timestamp;

    public Session(long id, String token, String timestamp) {
        this.id = id;
        this.token = token;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void destroy(long id){

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
