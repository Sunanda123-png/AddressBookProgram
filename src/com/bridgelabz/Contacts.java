package com.bridgelabz;

/**
 * Author:-Sunanda Shil
 * date:-03/10/2021
 */

public class Contacts {

    private String firstName, lastName, city, state, email;
    private int zip;
    private String phoneNumber;
//creating constructor
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
//to display the output
    public void display()
    {
        System.out.println("First Name : "+firstName+", Last Name : "+lastName+", City : "+city+", State : "+state+", Zip code : "+zip+", Email-ID : "+email+", Phone Number : "+phoneNumber);
    }

}
class AddressBook
{
    //creating object to call constructor
    public static void main(String[] args)
    {
        Contacts address=new Contacts("Sunanda","Shil","Guwahati","Assam",784115,"ssunanda02@gmail.com","7578061886");
        address.display();

    }

}