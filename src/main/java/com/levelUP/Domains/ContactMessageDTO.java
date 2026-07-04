package com.levelUP.Domains;

public class ContactMessageDTO{

    private int id;
    private String fullName;
    private String email;
    private String message;
    private String submittedAt;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

     public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

     public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

    public String getSubmittedAt() {return submittedAt;}
    public void setSubmittedAt(String submittedAt) {this.submittedAt = submittedAt;}
}