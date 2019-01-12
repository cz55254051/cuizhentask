package com.chatRobot.model;

public class Replay {
    private Integer id;

    private Integer messageId;

    private String name;

    private String content;

    private Long createAt;

    private Long updateAt;

    private String copyreader;

    public Replay(Integer id, Integer messageId, String name, String content, Long createAt, Long updateAt, String copyreader) {
        this.id = id;
        this.messageId = messageId;
        this.name = name;
        this.content = content;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.copyreader = copyreader;
    }

    public Replay() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        return "Replay{" +
                "id=" + id +
                ", messageId=" + messageId +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", copyreader='" + copyreader + '\'' +
                '}';
    }
}