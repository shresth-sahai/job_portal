package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        Student student=studentRepository.findById(1L).orElse(new Student());
        model.addAttribute("student",student);
        return "student/dashboard";
    }
    @GetMapping("/profile")
    public String profile(Model model){
        Student student=studentRepository.findById(1L).orElse(new Student());
        model.addAttribute("student",student);
        return "student/profile";
    }
    @PostMapping("/student")
    public String updateProfile(@ModelAttribute Student student){
        student.setId(1L);
        studentRepository.save(student);
        return "redirect:/student/dashboard";
    }
    @GetMapping("/jobs")
    public String jobList(){
        return "student/job_list";
    }
    @GetMapping("/applications")
    public String applicationList(){
        return "student/application_list";
    }
}
