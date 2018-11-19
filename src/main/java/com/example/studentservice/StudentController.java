package com.example.studentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return new ArrayList<Student>(){{
            add(new Student(1L,"Naznina"));
            add(new Student(2L,"Atik"));
        }};
    }

}
