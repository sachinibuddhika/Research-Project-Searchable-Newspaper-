package com.searchableVehicle.searchableVehicleApp.service;

import com.searchableVehicle.searchableVehicleApp.model.VehicleFeatures;
import com.searchableVehicle.searchableVehicleApp.repository.VehicleDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleFeaturesService {
    @Autowired
    private VehicleDetailRepo vehicleRepository;

    public List<VehicleFeatures> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public List<VehicleFeatures> listAll(String keyword) {
        if (keyword != null) {
            System.out.println("Keyword: " + keyword);  // Debugging
            return vehicleRepository.searchVehiclesByKeyword(keyword);
        } else {
            return vehicleRepository.findAll();
        }
    }


}
