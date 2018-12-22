package com.chatRobot.service;

import com.chatRobot.controller.Page;
import com.chatRobot.model.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(long id);
    Student selectStudent(long id);
    List<Student> findAll();
    List<Student> list(Page page);
    int total();
    List<Student> findByName(String name);
}
