public class Permission {
    private long id;
    private String permission;
    private boolean value;

    public Permission(long id, String permission, boolean value) {
        this.id = id;
        this.permission = permission;
        this.value = value;
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
}
