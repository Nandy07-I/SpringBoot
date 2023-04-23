package com.example.student_reg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class controller {
   @RequestMapping("/")
   public String getdetail()
   {
    return "getdetail";
   }
   
   
}
