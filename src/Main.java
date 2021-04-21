import model.User;
import registration.AdminRegistrator;
import registration.EmployeeRegistrator;
import registration.HRRegistrator;
import registration.UserRegistrator;

public class Main {

    /**
     * This is example of web server logic like POST request on registration or something
     * */
    public static void main(String[] args) {
        String username = "some_hr"; // fetched from json for example
        String password = "qwerty"; // fetched from json for example
        String mail = "some_hr@gmail.ru"; // fetched from json for example
        String reg_type = "HR"; // fetched from json for example
        UserRegistrator registrator = null;

        switch (reg_type) {
            case "HR": registrator = new HRRegistrator(); break;
            case "EMPLOYEE": registrator = new EmployeeRegistrator(); break;
            case "ADMIN": registrator = new AdminRegistrator(); break;
            default: System.exit(0); // like validation error 400 should be thrown
        }

        User new_user = registrator.register(username, password, mail);
        // some user implementation independent logic next ...
    }
}
