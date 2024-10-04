package com.searchableVehicle.searchableVehicleApp.controller;

import com.searchableVehicle.searchableVehicleApp.model.VehicleFeatures;
import com.searchableVehicle.searchableVehicleApp.service.VehicleFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/api/vehicles")
public class VehicleFeaturesController {

    @Autowired
    private VehicleFeaturesService vehicleService;

    @GetMapping("/")
    public String viewHomePage(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        List<VehicleFeatures> listVehicleFeatures = vehicleService.listAll(keyword);
        System.out.println("Vehicle List Size: " + listVehicleFeatures.size());  // Debugging
        model.addAttribute("listVehicleFeatures", listVehicleFeatures);
        model.addAttribute("keyword", keyword);
        return "index";  // Ensure this points to your index.html
    }

    @GetMapping("/search")
    public List<VehicleFeatures> getAll() {
        return vehicleService.getAllVehicles();
    }
}





