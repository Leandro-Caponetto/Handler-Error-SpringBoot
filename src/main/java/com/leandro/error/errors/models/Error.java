package com.leandro.error.errors.models;

import java.util.Date;

public class Error {

    private String message;
    private String error;
    private int statrus;
    private Date date;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatrus() {
        return statrus;
    }

    public void setStatrus(int statrus) {
        this.statrus = statrus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
