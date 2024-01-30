package bgx151.harj2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bgx151.harj2.domain.Friend;
import bgx151.harj2.domain.Student;

@Controller
public class MyController {

//		1. Hello Thymeleaf
//    @GetMapping("/hello")
//    public String hello(@RequestParam String name, @RequestParam int age, Model model) {
//        model.addAttribute("name", name);
//        model.addAttribute("age", age);
//
//        if (age > 18) {
//            model.addAttribute("message", "Welcome " + name + "!");
//        } else {
//            model.addAttribute("message", "You are too young!");
//        }
//
//        return "hello";
//    }
    
//		2. Handling Lists
//    @GetMapping("/hello")
//    public String showStudents(Model model) {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Jouni", "Jopoilija"));
//        studentList.add(new Student("Jukka", "Jututtaja"));
//        studentList.add(new Student("Joona", "Jousimies"));
//
//        model.addAttribute("students", studentList);
//
//        return "studentlist";
//    }

}