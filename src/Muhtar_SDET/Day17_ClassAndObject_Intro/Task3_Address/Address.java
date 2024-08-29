package Muhtar_SDET.Day17_ClassAndObject_Intro.Task3_Address;

import Muhtar_SDET.Day15_WhileLoop.ANSI_CODE;

// template
public class Address {

    // class attributes
    public int buildingNumber;
    public String street,city,state;
    public int zipCode;

    // object attributes
    public void setInfo(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void showAddress(){
        System.out.println(buildingNumber + " " +street + "\n" + city + " " + state + " " + zipCode );
    }


    public String toString() {
        return "Address{" +
                "buildingNumber =" + buildingNumber +
                ", street ='" + street + '\'' +
                ", city = '" + city + '\'' +
                ", state ='" + state + '\'' +
                ", zipCode ='" + zipCode + '\'' +
                '}';
    }

}
