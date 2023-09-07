package com.cydeo.spring08mvcmodal;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Jimmy","Mitch",12, Gender.MALE));
        mentorList.add(new Mentor("Jules","Mall",34, Gender.MALE));
        mentorList.add(new Mentor("Jeremiah","Fules",62, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);
        return "mentor/mentor-list";
    }
}
