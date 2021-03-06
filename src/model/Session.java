package model;

public class Session implements ORMmodel {
    private long id;
    private String token;
    private String timestamp;
    private User user;

    public Session(String token, String timestamp, User user) {
        this.token = token;
        this.timestamp = timestamp;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public void destroy(long id){

    }

    @Override
    public ORMmodel fetch(String id) {
        // some sql join
        return new Session("someToken", "22-04-2021", new User("placeholder", "placeholder", "placeholder"));
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
