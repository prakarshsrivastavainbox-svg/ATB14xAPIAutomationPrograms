/* POJO -> Plain Old Java Object --> POJO is simple class with instance variable
and getter and setter */


package com.myfirstrestassured_06_Payload_Management.POJO.Manual;

public class BookingDates {

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    private String checkin;
    private String checkout;
}
