package com.webapp2.model;

/**
 * Created by Justin on 7/27/16.
 */
public class User {
    private String name;
    private String specialMessage;
    private String firstLogin;

    public User() {
    }

    public User(String name, String specialMessage) {
        setName(name);
        setSpecialMessage(specialMessage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialMessage() {
        return specialMessage;
    }

    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }
    public String getFirstLogin() {
        return firstLogin;
    }
    public void setFirstLogin(String firstLogin) {
        this.firstLogin = firstLogin;
    }

}
