package com.jetbrains;

public class Shuttle{


    private String shuttleId;
    private String shuttleName;
    private String manufacturingYear;
    private String fuelCapacity;
    private String travelSpeed;
    private String passengerCapacity;
    private String cargoCapacity;


    public Shuttle(){

    }

    public Shuttle(String shuttleId, String shuttleName,String manufacturingYear, String fuelCapacity,
                   String travelSpeed, String passengerCapacity, String cargoCapacity){
        this.shuttleId = shuttleId;
        this.shuttleName = shuttleName;
        this.manufacturingYear = manufacturingYear;
        this.fuelCapacity = fuelCapacity;
        this.travelSpeed = travelSpeed;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;


    }

    /**
     *used to retrieve shuttleId
     */
    public String getShuttleId() {
        return shuttleId+",";
    }
    /**
     *used to update or setShuttleId
     */
    public void setShuttleId(String shuttleId) {
        this.shuttleId = shuttleId;
    }
    /**
     *used to retrieve shuttle name
     */
    public String getShuttleName() {
        return shuttleName;
    }
    /**
     *used to update or set shuttle Name
     */

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }
    /**
     *used to retrieve manufacturing Year
     */
    public String getManufacturingYear() {
        return manufacturingYear;
    }

    /**
     *used to update or set manufacturing Year
     */

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
    /**
     *used to retrieve fuel Capacity
     */
    public String getFuelCapacity() {
        return fuelCapacity;
    }
    /**
     *used to update or set fuel Capacity
     */

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    /**
     *used to retrieve travel Speed
     */
    public String getTravelSpeed() {
        return travelSpeed;
    }
    /**
     *used to update or set travel Speed
     */

    public void setTravelSpeed(String travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    /**
     *used to retrieve passenger Capacity
     */
    public String getPassengerCapacity() {
        return passengerCapacity;
    }
    /**
     *used to update or set passenger Capacity
     */

    public void setPassengerCapacity(String passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    /**
     *used to retrieve cargo Capacity
     */
    public String getCargoCapacity() {
        return cargoCapacity;
    }
    /**
     *used to update or set cargo Capacity
     */
    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


}