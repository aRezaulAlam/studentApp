package com.agroho.controller;


import com.agroho.domain.Student;
import com.agroho.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: rezaul || Date: 2/5/17.
 */

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/")
    public String goHome(){
        return "Welcome to home";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Long addStudent(@RequestBody Student student){

        Student studentAdded = studentRepository.save(student);

        return studentAdded.getId();

    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
