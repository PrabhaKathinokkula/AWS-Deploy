package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
   @GetMapping("/home")
   public String disk() {
	   return "Designed by 23MH1A0524";
   }
   
   @GetMapping("/cse")
   public String cse() {
	   return "This is Springboot Application Deployment";
   }
}
