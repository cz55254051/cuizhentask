package com.chatRobot.controller;


import com.chatRobot.dao.StudentMapper;
import com.chatRobot.model.Student;
import com.chatRobot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class StudentController {
    private static Logger logger = Logger.getLogger(String.valueOf(StudentController.class));
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students",method= RequestMethod.GET)
    @ResponseBody
    public ModelAndView list(Page page) {
        ModelAndView mav = new ModelAndView();
        List<Student> students = studentService.list(page);
       int total = studentService.total();
        logger.info("total = " + total);
        page.caculateLast(total);
        mav.addObject("students", students);
        mav.setViewName("listStudent");
        return mav;
    }

//增加
    @RequestMapping(value="/students",method = RequestMethod.POST)
    @ResponseBody
        public ModelAndView saveStudent(@Validated Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error : errors) {
                logger.info(error.getDefaultMessage());
            }
            model.addAttribute("student", student);
            ModelAndView mav = new ModelAndView("listStudent");
            mav.addObject("student",student);

           return mav;
        }
        studentService.addStudent(student);
        ModelAndView mav = new ModelAndView("redirect:/students");
        mav.addObject("student",student);

        return mav;
    }
//删除
    @RequestMapping(value = "/students/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ModelAndView deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
        System.out.println(id);
        ModelAndView mav = new ModelAndView("redirect:/students");
        return mav;
    }
    //根据id查询数据
    @RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView teditStudent(@PathVariable long id) {
        System.out.println(id);
        Student s = studentService.selectStudent(id);
        logger.info("student = " + s);
        ModelAndView mav = new ModelAndView("editStudent");
        mav.addObject("student", s);
        System.out.println(s);
        return mav;
    }
    //        修改
    @RequestMapping(value = "/students/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public ModelAndView updateStudent(Student student) {
        int i=studentService.updateStudent(student);
        System.out.println(i);
        ModelAndView mav = new ModelAndView("redirect:/students");
        return mav;
    }
//         模糊查询
    @RequestMapping(value = "/student/name",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView findStudentName(@RequestParam String name) {
        System.out.println(name);
        List<Student> student = studentService.findByName(name);
        logger.info("student = " + student);
        ModelAndView mav = new ModelAndView();
        mav.addObject("student", student);
        mav.setViewName("findName");
        return mav;
    }
}
