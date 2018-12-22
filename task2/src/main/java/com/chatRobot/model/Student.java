package com.chatRobot.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Student {

    @NotNull(message = "id不能为空")
        private long id;
    @NotBlank(message = "学生姓名不能为空")
        private String name;
    @NotNull(message = "qq不能为空")
        private long qq;
    @NotBlank(message = "修真类型不能为空")
        private String type;
    @NotBlank(message = "入学时间不能为空")
        private String time;
    @NotBlank(message = "毕业院校不能为空")
        private String graduateInstitutions;
    @NotBlank(message = "日报链接不能为空")
        private String dailyLink;
    @NotBlank(message = "志愿不能为空")
        private String volunteer;
    @NotNull(message = "创建时间不能为空")
        private long createAt;
    @NotNull(message = "更新时间不能为空")
        private long updateAt;
//    定义的私有属性

        public Student(){}
        //    无参数的构造器


        public Student(long id, String name, long qq, String type, String time, String graduateInstitutions, String dailyLink, String volunteer, long createAt, long updateAt) {
            this.id = id;
            this.name = name;
            this.qq = qq;
            this.type = type;
            this.time = time;
            this.graduateInstitutions = graduateInstitutions;
            this.dailyLink = dailyLink;
            this.volunteer = volunteer;
            this.createAt = createAt;
            this.updateAt = updateAt;
        }
//有参构造器


        public long getId() { return id; }
        public void setId(long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public long getQq() { return qq; }
        public void setQq(long qq) { this.qq = qq; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public String getTime() { return time; }
        public void setTime(String time) { this.time = time; }
        public String getGraduateInstitutions() { return graduateInstitutions; }
        public void setGraduateInstitutions(String graduateInstitutions) { this.graduateInstitutions = graduateInstitutions; }
        public String getDailyLink() { return dailyLink; }
        public void setDailyLink(String dailyLink) { this.dailyLink = dailyLink; }
        public String getVolunteer() { return volunteer; }
        public void setVolunteer(String volunteer) { this.volunteer = volunteer; }
        public long getCreateAt() { return createAt; }
        public void setCreateAt(long createAt) { this.createAt = createAt; }
        public long getUpdateAt() { return updateAt; }
        public void setUpdateAt(long updateAt) { this.updateAt = updateAt; }
//get和set方法

        @Override
        public String toString() {
            return "Stuednt{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", qq=" + qq +
                    ", type='" + type + '\'' +
                    ", time='" + time + '\'' +
                    ", graduateInstitutions='" + graduateInstitutions + '\'' +
                    ", dailyLink='" + dailyLink + '\'' +
                    ", volunteer='" + volunteer + '\'' +
                    ", createAt=" + createAt +
                    ", updateAt=" + updateAt +
                    '}';
        }
    }


