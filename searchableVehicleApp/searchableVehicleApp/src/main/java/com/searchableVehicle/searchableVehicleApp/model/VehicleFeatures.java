package com.searchableVehicle.searchableVehicleApp.model;


import jakarta.persistence.*;

@Entity
@Table(name="vehicle_features")
public class VehicleFeatures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicle_id;

    private String vehicle_brand;
    private String vehicle_model;
    private String year_of_manufacture;
    private String country_made;
    private String body_type;
    private String vehicle_condition;
    private String color;
    private String fuel_type;
    private String fuel_efficiency;
    private String owner_details;
    private String mileage;
    private String engine_type;
    private String engine_capacity;
    private String maximum_speed;
    private String transmission_type;
    private String drivetrain;
    private String maintenance_records;
    private String seating_capacity;
    private String seating_comfort;
    private String storage_capacity;
    private String advanced_braking_system;
    private String navigation_system;
    private String air_conditioning;
    private String air_bag;
    private String hybrid_electric_options;
    private String climate_control;
    private String lighting;
    private String gearbox;
    private String price;
    private String contact_number;
    private String location;
    private String other;

    public Integer getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Integer vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_brand() {
        return vehicle_brand;
    }

    public void setVehicle_brand(String vehicle_brand) {
        this.vehicle_brand = vehicle_brand;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public String getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(String year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public String getCountry_made() {
        return country_made;
    }

    public void setCountry_made(String country_made) {
        this.country_made = country_made;
    }

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public String getVehicle_condition() {
        return vehicle_condition;
    }

    public void setVehicle_condition(String vehicle_condition) {
        this.vehicle_condition = vehicle_condition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getFuel_efficiency() {
        return fuel_efficiency;
    }

    public void setFuel_efficiency(String fuel_efficiency) {
        this.fuel_efficiency = fuel_efficiency;
    }

    public String getOwner_details() {
        return owner_details;
    }

    public void setOwner_details(String owner_details) {
        this.owner_details = owner_details;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public String getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(String engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public String getMaximum_speed() {
        return maximum_speed;
    }

    public void setMaximum_speed(String maximum_speed) {
        this.maximum_speed = maximum_speed;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public String getMaintenance_records() {
        return maintenance_records;
    }

    public void setMaintenance_records(String maintenance_records) {
        this.maintenance_records = maintenance_records;
    }

    public String getSeating_capacity() {
        return seating_capacity;
    }

    public void setSeating_capacity(String seating_capacity) {
        this.seating_capacity = seating_capacity;
    }

    public String getSeating_comfort() {
        return seating_comfort;
    }

    public void setSeating_comfort(String seating_comfort) {
        this.seating_comfort = seating_comfort;
    }

    public String getStorage_capacity() {
        return storage_capacity;
    }

    public void setStorage_capacity(String storage_capacity) {
        this.storage_capacity = storage_capacity;
    }

    public String getAdvanced_braking_system() {
        return advanced_braking_system;
    }

    public void setAdvanced_braking_system(String advanced_braking_system) {
        this.advanced_braking_system = advanced_braking_system;
    }

    public String getNavigation_system() {
        return navigation_system;
    }

    public void setNavigation_system(String navigation_system) {
        this.navigation_system = navigation_system;
    }

    public String getAir_conditioning() {
        return air_conditioning;
    }

    public void setAir_conditioning(String air_conditioning) {
        this.air_conditioning = air_conditioning;
    }

    public String getAir_bag() {
        return air_bag;
    }

    public void setAir_bag(String air_bag) {
        this.air_bag = air_bag;
    }

    public String getHybrid_electric_options() {
        return hybrid_electric_options;
    }

    public void setHybrid_electric_options(String hybrid_electric_options) {
        this.hybrid_electric_options = hybrid_electric_options;
    }

    public String getClimate_control() {
        return climate_control;
    }

    public void setClimate_control(String climate_control) {
        this.climate_control = climate_control;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
