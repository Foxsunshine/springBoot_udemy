package com.luv2code.demo.rest;

public class StudentErrorResponse{

    private int status;
    private String message;
    private long timeStamp;

    public StudentErrorResponse(){

    }


    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimeStamp(long timeStamp) {
        tthis.timeStamp = timeStamp;
    }

    public int setStatus() {
        return status;
    }

    public String getMessgae() {
        return message;
    }

    public long timeStamp() {
        return timeStamp;
    }
}