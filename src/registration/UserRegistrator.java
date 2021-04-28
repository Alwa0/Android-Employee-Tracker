package registration;

import model.User;

public abstract class UserRegistrator {

    private String passwordHash(String pass){
        // Some very smart hashing algorithm, this is helping method for internal usage
        // which reflects that this registrator is responsible for CREATION so that
        // factory method pattern can be applied
        return pass+pass;
    }

    /** OUR ACTUAL FACTORY METHOD */
    public User register(String username, String email, String pass){
        User user = new User( username, email, pass);
        user.save();
        return user;
    }
}
