package com.example.microser.controller;


import com.example.microser.model.Teacher;
import com.example.microser.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/teacher")
@Slf4j
@Transactional
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
    @GetMapping("/showTeacher")
    public List<Teacher> getTeacher(){
        return teacherService.getTeacher();
    }
    @GetMapping("/find/{id}")
    public List<Teacher> findTeacherById(@PathVariable("id") Long id){
        return teacherService.findTeacherById(id.longValue());
    }
    @DeleteMapping("/delete/{id}")
    public List<Teacher> deleteTeacherById(@PathVariable("id") Long id){
        return teacherService.deleteTeacherById(id);
    }
}
