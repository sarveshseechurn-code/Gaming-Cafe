package com.levelUP.Domains;

public class PaymentDTO{

    private int id;
    private int bookingId;
    private double amount;
    private String status;
    private String paidAt;
    private String method;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public int getBookingId() {return bookingId;}
    public void setBookingId(int id) {this.bookingId = bookingId;}

    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public String getPaidAt() {return paidAt;}
    public void setPaidAt(String paidAt) {this.paidAt = paidAt;}

    public String getmethod() {return method;}
    public void setMethod(String method) {this.method = method;}


}