public abstract class User {
    private long id;
    private String password;
    private String username;

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

    private String email;

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



    public User(long id, String password, String username, String email) {
        this.id = id;
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
