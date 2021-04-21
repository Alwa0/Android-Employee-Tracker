public abstract class UserRegistrator {
    private String password_hash(String pass){
        return "some hash";
    }
    public User register(String username, String email, String pass){
        return new User(1, username, email, pass);
    }
}
