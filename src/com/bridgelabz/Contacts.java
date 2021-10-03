package com.bridgelabz;

import java.math.BigInteger;

public class Contacts {

    private String firstName, lastName, city, state, email;
    private int zip;
    private String phoneNumber;

    public Contacts(String firstName, String lastName, String city, String state, int zip, String email,
                   String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void display()
    {
        System.out.println("First Name : "+firstName+", Last Name : "+lastName+", City : "+city+", State : "+state+", Zip code : "+zip+", Email-ID : "+email+", Phone Number : "+phoneNumber);
    }

}
class AddressBook
{
    public static void main(String[] args)
    {
        Contacts address=new Contacts("Sunanda","Shil","Guwahati","Assam",784115,"ssunanda02@gmail.com","7578061886");
        address.display();

    }

}