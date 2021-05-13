import model.*;

import java.util.Date;

public class Main {

    /**
     * This is example of web server logic
     * */
    public static void main(String[] args) {

        System.out.println("== SIMPLE USAGE EXAMPLE ==\n");
        // Example of HR subscription for USER
        // endpoint for example /api/employees/123/subscribe/ executed by HR #10
        String id_from_request = "10";
        HR some_hr_with_id_10 = (HR) (new HR()).fetch(id_from_request);
        Employee employee = (Employee) (new Employee()).fetch("123");

        employee.setLocation(new GPSLocation(70, 70, new Date()));
        employee.getLocationPublisher().subscribe(some_hr_with_id_10);


        // Example of HR subscription for USER
        // endpoint for example /api/employees/123/subscribe/ executed by HR #20
        id_from_request = "20";
        HR some_hr_with_id_20 = (HR) (new HR()).fetch(id_from_request);

        employee.setLocation(new GPSLocation(70, 70, new Date()));
        employee.getLocationPublisher().subscribe(some_hr_with_id_20);


        // Example of HR subscription for USER
        // endpoint for example /api/employees/123/subscribe/ executed by HR #30
        id_from_request = "30";
        HR some_hr_with_id_30 = (HR) (new HR()).fetch(id_from_request);

        employee.setLocation(new GPSLocation(70, 70, new Date()));
        employee.getLocationPublisher().subscribe(some_hr_with_id_30);

        // Same Employee updating its location via HTTP POST request
        // like that:
        // id_from_request = "123";
        // Employee employee = (new Employee).fetch(id_from_request)
        GPSLocation location = new GPSLocation(120, 120, new Date()); // Serializer from JSON for example
        employee.setLocation(location);
        // all 3 subscribed HRs receives Push notifications



        // ================================
        // OLD CODE RELATED TO ASSIGNMENT 2
        // ================================


//        // fetch user from database with id 123 and send push notification
//        TeamComponent tc = (new Employee()).fetch("123");
//        tc.pushNotify("MESSAGE FROM THE BOSS", "YOU FIRED!");
//
//        // fetch team from database with id 123 and send message to ALL members
//        // in this team since interface is the same
//        TeamComponent firstTeam = (new Team()).fetch("1");
//        firstTeam.pushNotify("SCHEDULING NEWS", "Guys we are not working on that friday");
//
//        // some use case of unified usage. Suppose we have some smart
//        // advertising algorithm which generate set of teams/users
//
//        // SOME TEAM WITH MANY MEMBERS AND TEAMS INSIDE
//        System.out.println("\n== UNIFIED USAGE EXAMPLE ==");
//        TeamComponent team1Tree = (new Team()).fetch("1");
//        team1Tree.addComponent((new Employee()).fetch("1001"));
//        team1Tree.addComponent((new Employee()).fetch("1002"));
//        team1Tree.addComponent((new Employee()).fetch("1003"));
//
//        TeamComponent innerTeam = (new Team()).fetch("2");
//        innerTeam.addComponent((new Employee()).fetch("2001"));
//        innerTeam.addComponent((new Employee()).fetch("2002"));
//        team1Tree.addComponent(innerTeam);
//
//        TeamComponent team3Tree = (new Team()).fetch("3");
//        team3Tree.addComponent((new Employee()).fetch("3001"));
//        team3Tree.addComponent((new Employee()).fetch("3002"));
//
//        List<TeamComponent> advertisement = Arrays.asList(
//                (new HR()).fetch("123"),
//                (new HR()).fetch("133"),
//                team1Tree,
//                (new Admin()).fetch("145"),
//                (new Admin()).fetch("167"),
//                team3Tree,
//                (new Employee()).fetch("190"),
//                (new Employee()).fetch("4") // Supports empty team as well
//        );
//        advertisement.forEach(teamComponent -> teamComponent.pushNotify("ADVERTISEMENT", "Hello dear clients and teams, we want keep in touch..."));

        // ================================
        // OLD CODE RELATED TO ASSIGNMENT 1
        // ================================

//        String username = "some_hr_with_id_10"; // fetched from json for example
//        String password = "qwerty"; // fetched from json for example
//        String mail = "some_hr_with_id_10@gmail.ru"; // fetched from json for example
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
