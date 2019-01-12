package com.chatRobot.model;

public class Banner {
    private Integer id;

    private String cover;

    private String url;

    private Boolean status;

    private Long createAt;

    private Long updateAt;

    private String copyreader;

    public Banner(Integer id, String cover, String url, Boolean status, Long createAt, Long updateAt, String copyreader) {
        this.id = id;
        this.cover = cover;
        this.url = url;
        this.status = status;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.copyreader = copyreader;
    }

    public Banner() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        return "Banner{" +
                "id=" + id +
                ", cover='" + cover + '\'' +
                ", url='" + url + '\'' +
                ", status=" + status +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", copyreader='" + copyreader + '\'' +
                '}';
    }
}