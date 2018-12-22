package com.chatRobot.service.impl;

import com.chatRobot.controller.Page;
import com.chatRobot.dao.StudentMapper;
import com.chatRobot.model.Student;
import com.chatRobot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int addStudent(Student student) { return studentMapper.addStudent(student); }
    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }
    @Override
    public int deleteStudent(long id) {
        return studentMapper.deleteStudent(id);
    }
    @Override
    public Student selectStudent(long id) {
        return studentMapper.selectStudent(id);
    }
    @Override
    public List<Student> findAll() { return studentMapper.findAll(); }
    @Override
    public List<Student> list(Page page) { return studentMapper.list(page); }
    @Override
    public int total() {
        return studentMapper.total();
    }
    @Override
    public List<Student> findByName(String name) { return studentMapper.findByName(name); }


}
