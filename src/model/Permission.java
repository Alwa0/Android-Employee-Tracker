package model;

public class Permission implements ORM_Model {
    private long id;
    private String permission;
    private boolean value;

    public Permission(String permission, boolean value) {
        this.id = id;
        this.permission = permission;
        this.value = value;
    }

    public Permission(User user, String permission) {
        this.id = id;
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
    public void save() {
        // some smart sql
    }

    @Override
    public ORM_Model update(String... fields) {
        // some smart sql
        return this;
    }

    @Override
    public ORM_Model delete(String... fields) {
        // some smart sql
        return this;
    }
}
