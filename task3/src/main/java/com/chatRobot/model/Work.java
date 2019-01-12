package com.chatRobot.model;

public class Work {
    private Integer id;

    private String name;

    private Integer showreelId;

    private Integer classifyId;

    private String intro;

    private String picture;

    private String video;

    private String article;

    private Long createAt;

    private Long updateAt;

    private String copyreader;

    public Work(Integer id, String name, Integer showreelId, Integer classifyId, String intro, String picture, String video, String article, Long createAt, Long updateAt, String copyreader) {
        this.id = id;
        this.name = name;
        this.showreelId = showreelId;
        this.classifyId = classifyId;
        this.intro = intro;
        this.picture = picture;
        this.video = video;
        this.article = article;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.copyreader = copyreader;
    }

    public Work() {
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

    public Integer getShowreelId() {
        return showreelId;
    }

    public void setShowreelId(Integer showreelId) {
        this.showreelId = showreelId;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article == null ? null : article.trim();
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
        return "Work{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", showreelId=" + showreelId +
                ", classifyId=" + classifyId +
                ", intro='" + intro + '\'' +
                ", picture='" + picture + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", copyreader='" + copyreader + '\'' +
                '}';
    }
}