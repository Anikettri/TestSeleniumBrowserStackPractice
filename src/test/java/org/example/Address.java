package org.example;

public class Address {
    public Address(){}
    public Address(String street, String city, int zip){
        this.street=street;
        this.city=city;
        this.zip=zip;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    private String street;
    private String city;
    private int zip;
}
