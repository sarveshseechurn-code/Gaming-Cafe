package com.levelUP.domains;

public class BookingDTO{

    private int id;
    private String fullName;
    private int serviceId;
    private String timeSlot;
    private String status;
    private boolean snacksPackage;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public int getServiceId() {return serviceId;}
    public void setServiceId(int serviceid) {this.serviceId = serviceId;}

    public String getTimeSlot() {return timeSlot;}
    public void setTimeSlot(String timeSlot) {this.timeSlot = timeSlot;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public Boolean getSnacksPackage() {return snacksPackage;}
    public void setSnacksPackage(Boolean snacksPackage) {this.snacksPackage = snacksPackage;}
}