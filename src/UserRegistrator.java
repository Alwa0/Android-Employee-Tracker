public abstract class UserRegistrator {
    private String password_hash(String pass){
        return "some hash";
    }
    public User register(long id, String username, String email, String pass){
        return new User(id, username, email, pass);
    }
}
