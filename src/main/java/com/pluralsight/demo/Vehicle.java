package com.pluralsight.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "Vehicles", schema = "GTA")
public class Vehicle {

    @Id
    @Column(name = "VehicleID")
    private Long vehicleId;

    @Column(name = "OwnerID")
    private Long ownerId;

    @Column(name = "Type")
    private String type;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Speed")
    private int speed;

    @Column(name = "IsStolen") // Correct hoofdlettergebruik!
    private boolean isStolen;

    // 🛠️ Getters
    public Long getVehicleId() {
        return vehicleId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStolen() {
        return isStolen;
    }

    // 🧰 Setters
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStolen(boolean stolen) {
        isStolen = stolen;
    }
}
