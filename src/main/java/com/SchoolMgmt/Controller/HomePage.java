package com.SchoolMgmt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

    @GetMapping("/index")
    public String homepage(){
        return "index";
    }

}
