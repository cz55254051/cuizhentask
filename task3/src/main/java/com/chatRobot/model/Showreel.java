package com.chatRobot.model;

public class Showreel {
    private Integer id;

    private String name;

    private Boolean status;

    private Long createAt;

    private Long updateAt;

    private String copyreader;

    public Showreel(Integer id, String name, Boolean status, Long createAt, Long updateAt, String copyreader) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.copyreader = copyreader;
    }

    public Showreel() {
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
        return "Showreel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", copyreader='" + copyreader + '\'' +
                '}';
    }
}