package com.speedup.qa.models;

public class UpdateData {

    private String name;
    private String lastname;
    private String birthdate;
    private String country;


    public UpdateData(String name, String lastname, String birthdate,
                      String country) {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.country = country;


    }
    public String getName() { return name;}
    public String getLastname() { return lastname; }
    public String getBirthdate() {return  birthdate;}
    public String getCountry() {return country;}
}
