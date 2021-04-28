package model;

public class User extends TeamComponent implements ORM_Model{
    private long id;
    private String password;
    private String username;
    private String email;

    public void setId(long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
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

    public User(String password, String username, String email) {
        this.password = password;
        this.username = username;
        this.email = email;
    }

    public boolean logout(){
        return true;
    }

    public boolean login(long id, String password){
        return true;
    }
}
