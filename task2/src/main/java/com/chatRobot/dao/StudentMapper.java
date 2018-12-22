package com.chatRobot.dao;

import com.chatRobot.controller.Page;
import com.chatRobot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    int addStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(long id);
    Student selectStudent(long id);
    List<Student> findAll();
    List<Student> list(Page page);
    int total();
    List<Student> findByName(String name);

}
