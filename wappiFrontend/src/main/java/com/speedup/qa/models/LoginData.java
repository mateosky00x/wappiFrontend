package com.speedup.qa.models;

public class LoginData {
    private String user;
    private String password;

    public LoginData(String user, String password) {
        this.user = user;
        this.password = password;
    }
    public String getUser() { return user;}
    public String getPassword() { return password; }

}
