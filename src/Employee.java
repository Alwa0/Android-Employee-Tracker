import java.awt.image.BufferedImage;

public class Employee extends User{
    public GPS_location getLocation() {
        return location;
    }

    public void setLocation(GPS_location location) {
        this.location = location;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    private GPS_location location;
    private BufferedImage image;
    private long salary;

    public Employee(GPS_location location, BufferedImage image, long salary, long id, String password, String username, String email) {
        super(id, password, username, email);
        this.location = location;
        this.image = image;
        this.salary = salary;
    }
}
