package org.example;

public class Contact {
    public Contact(){}
    public Contact(int home, int mobileNumber, Address address){
        this.home=home;
        this.mobileNumber=mobileNumber;
        this.address=address;
    }
    private int home;
    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private int mobileNumber;
    private Address address;
}
