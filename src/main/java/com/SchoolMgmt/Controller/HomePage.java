package com.SchoolMgmt.Controller;

import com.SchoolMgmt.Entity.Student;
import com.SchoolMgmt.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomePage {

    @Autowired
    private StudentService studentService;

    @GetMapping("/index")
    public String homepage(Model model){

        List<Student> students=studentService.getAllStudent();
        model.addAttribute("student", students);
        return "index";
    }

}
