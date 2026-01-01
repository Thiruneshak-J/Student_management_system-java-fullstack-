package com.example.studentmanager.controller;

import com.example.studentmanager.model.Student;
import com.example.studentmanager.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Student add(@RequestBody Student s) {
        return service.addStudent(s);
    }

    @GetMapping("/all")
    public List<Student> getAll() {
        return service.getAllStudents();
    }
}
