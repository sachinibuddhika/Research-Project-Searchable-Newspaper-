package com.searchableVehicle.searchableVehicleApp.repository;

import com.searchableVehicle.searchableVehicleApp.model.VehicleFeatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleDetailRepo extends JpaRepository<VehicleFeatures, Integer> {

    // Search for the keyword in multiple fields (brand, model, and description)
    @Query("SELECT v FROM VehicleFeatures v WHERE " +
            "v.vehicle_brand LIKE %:keyword% OR " +
            "v.vehicle_model LIKE %:keyword% OR " +
            "v.year_of_manufacture LIKE %:keyword% OR " +
            "v.country_made LIKE %:keyword% OR " +
            "v.body_type LIKE %:keyword% OR " +
            "v.vehicle_condition LIKE %:keyword% OR " +
            "v.color LIKE %:keyword% OR " +
            "v.fuel_type LIKE %:keyword% OR " +
            "v.fuel_efficiency LIKE %:keyword% OR " +
            "v.owner_details LIKE %:keyword% OR " +
            "v.mileage LIKE %:keyword% OR " +
            "v.engine_type LIKE %:keyword% OR " +
            "v.engine_capacity LIKE %:keyword% OR " +
            "v.maximum_speed LIKE %:keyword% OR " +
            "v.transmission_type LIKE %:keyword% OR " +
            "v.drivetrain LIKE %:keyword% OR " +
            "v.maintenance_records LIKE %:keyword% OR " +
            "v.seating_capacity LIKE %:keyword% OR " +
            "v.seating_comfort LIKE %:keyword% OR " +
            "v.storage_capacity LIKE %:keyword% OR " +
            "v.advanced_braking_system LIKE %:keyword% OR " +
            "v.navigation_system LIKE %:keyword% OR " +
            "v.air_conditioning LIKE %:keyword% OR " +
            "v.air_bag LIKE %:keyword% OR " +
            "v.hybrid_electric_options LIKE %:keyword% OR " +
            "v.climate_control LIKE %:keyword% OR " +
            "v.lighting LIKE %:keyword% OR " +
            "v.gearbox LIKE %:keyword% OR " +
            "v.price LIKE %:keyword% OR " +
            "v.contact_number LIKE %:keyword% OR " +
            "v.location LIKE %:keyword% OR " +
            "v.other LIKE %:keyword%")
    List<VehicleFeatures> searchVehiclesByKeyword(@Param("keyword") String keyword);

}
