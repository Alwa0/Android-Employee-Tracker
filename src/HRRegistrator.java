public class HRRegistrator extends UserRegistrator{
    @Override
    public User register(String username, String email, String pass) {
        HR hr = new HR(1, pass, username, email);
        return hr;
    }
}
