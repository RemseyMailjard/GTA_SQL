package com.pluralsight.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CitizenController {

    private final CitizenRepository repo;

    public CitizenController(CitizenRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/citizens")
    public String getAllCitizens(Model model) {
        List<Citizen> list = repo.findAll();
        model.addAttribute("citizens", list);
        return "citizens"; // Thymeleaf template name
    }
}
