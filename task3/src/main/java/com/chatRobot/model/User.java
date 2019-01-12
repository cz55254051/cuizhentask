package com.chatRobot.model;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String role;

    private Integer permission;

    private Long createAt;

    private Long updateAt;

    private String copyreader;

    public User(Integer id, String name, String password, String role, Integer permission, Long createAt, Long updateAt, String copyreader) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.permission = permission;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.copyreader = copyreader;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getCopyreader() {
        return copyreader;
    }

    public void setCopyreader(String copyreader) {
        this.copyreader = copyreader == null ? null : copyreader.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", permission=" + permission +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", copyreader='" + copyreader + '\'' +
                '}';
    }
}