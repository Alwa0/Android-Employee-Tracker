import model.Team;
import model.TeamComponent;
import model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * This is example of web server logic
     * */
    public static void main(String[] args) {
        // fetch user from database with id 123 and send push notification
        TeamComponent tc = (new User()).fetch("123");
        tc.pushNotify("MESSAGE FROM THE BOSS", "YOU FIRED!");

        // fetch team from database with id 123 and send message to ALL members
        // in this team since interface is the same
        TeamComponent firstTeam = (new Team()).fetch("1");
        firstTeam.pushNotify("SCHEDULING NEWS", "Guys we are not working on that friday");

        // some use case of unified usage. Suppose we have some smart
        // advertising algorithm which generate set of teams/users

        // SOME TEAM WITH MANY MEMBERS AND TEAMS INSIDE
        TeamComponent team1_tree = (new Team()).fetch("1");
        team1_tree.addComponent((new User()).fetch("1001"));
        team1_tree.addComponent((new User()).fetch("1002"));
        team1_tree.addComponent((new User()).fetch("1003"));
        team1_tree.addComponent((new Team()).fetch("2"));

        List<TeamComponent> advertisement = Arrays.asList(
                (new User()).fetch("123"),
                (new User()).fetch("133"),
                team1_tree,
                (new User()).fetch("145"),
                (new User()).fetch("167"),
                (new Team()).fetch("2"),
                (new User()).fetch("190"),
                (new Team()).fetch("3"),
                (new Team()).fetch("4")
        );
        advertisement.forEach(teamComponent -> teamComponent.pushNotify("ADVERTISEMENT", "Hello dear clients and teams, we want keep in touch..."));

        // ================================
        // OLD CODE RELATED TO ASSIGNMENT 1
        // ================================

//        String username = "some_hr"; // fetched from json for example
//        String password = "qwerty"; // fetched from json for example
//        String mail = "some_hr@gmail.ru"; // fetched from json for example
//        String reg_type = "HR"; // fetched from json for example
//
//        // Example of polymorphism via factory pattern
//        UserRegistrator registrator = null;
//        switch (reg_type) {
//            case "HR": registrator = new HRRegistrator(); break;
//            case "EMPLOYEE": registrator = new EmployeeRegistrator(); break;
//            case "ADMIN": registrator = new AdminRegistrator(); break;
//            default: System.exit(0); // like validation error 400 should be thrown
//        }
//
//        User new_user = registrator.register(username, password, mail);
//        // some user implementation independent logic next ...
//        // also pattern example usage located in add_employee method of Admin class
    }
}
