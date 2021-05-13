package model;

public class Permission implements ORMmodel {
    private long id;
    private long userId;
    private String permission;
    private boolean value;

    public Permission(User user, String permission, boolean value) {
        this.userId = user.getId();
        this.permission = permission;
        this.value = value;
    }

    public Permission(User user, String permission) {
        this.userId = user.getId();
        this.permission = permission;
        this.value = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean grant(String permission){
        return true;
    }

    @Override
    public ORMmodel fetch(String id) {
        // sql join
        return new Permission(new User("placeholder", "placeholder", "placeholder"), "some.permission");
    }

    @Override
    public void save() {
        // some smart sql
    }

    @Override
    public ORMmodel update(String... fields) {
        // some smart sql
        return this;
    }

    @Override
    public ORMmodel delete(String... fields) {
        // some smart sql
        return this;
    }
}
