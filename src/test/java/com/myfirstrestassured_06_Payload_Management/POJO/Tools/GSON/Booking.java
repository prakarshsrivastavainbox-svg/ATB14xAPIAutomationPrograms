package com.myfirstrestassured_06_Payload_Management.POJO.Tools.GSON;



import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Booking {

    @SerializedName("bookingid")
    @Expose
    private Integer bookingid;
    @SerializedName("booking")
    @Expose
    private Booking__1 booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking__1 getBooking() {
        return booking;
    }

    public void setBooking(Booking__1 booking) {
        this.booking = booking;
    }

}
