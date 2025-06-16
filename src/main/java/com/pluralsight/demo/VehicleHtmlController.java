package com.pluralsight.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class VehicleHtmlController {

    private final VehicleRepository repo;

    public VehicleHtmlController(VehicleRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/vehicles")
    public String getAllVehicles(Model model) {
        List<Vehicle> vehicles = repo.findAll();
        System.out.println("Aantal voertuigen: " + vehicles.size());

        model.addAttribute("vehicles", vehicles);
        return "vehicles";
    }
    @GetMapping("/vehicles/test")
    public String getTestVehicles(Model model) {
        List<Vehicle> testVehicles = repo.findAll();
        if (testVehicles.isEmpty()) {
            System.out.println("⚠️ Geens voertuigen gevonden.");
            return "error"; // Zorg dat je een error.html hebt of een tekst teruggeeft
        }
        model.addAttribute("vehicles", List.of(testVehicles.get(0)));
        return "vehicles";
    }

}