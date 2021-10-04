package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author:-Sunanda Shil
 * date:-03/10/2021
 */

public class Contacts
{
    public static void addPerson()
    {
        ArrayList<String> firstName= new ArrayList<>();
        ArrayList<String> lastname= new ArrayList<>();
        ArrayList<String> Address= new ArrayList<>();
        ArrayList<String> city= new ArrayList<>();
        ArrayList<String> State= new ArrayList<>();
        ArrayList<Integer> Zip= new ArrayList<>();
        ArrayList<Long> phoneNo= new ArrayList<>();
        ArrayList<String> Email= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter following details \n" +
                "First Name :");
        firstName.add(scanner.next());
        System.out.println("Last Name :");
        lastname.add(scanner.next());
        System.out.println("Address :");
        Address.add(scanner.next());
        System.out.println("City :");
        city.add(scanner.next());
        System.out.println("State :");
        State.add(scanner.next());
        System.out.println("Zip Code :");
        Zip.add(scanner.nextInt());
        System.out.println("Phone Number :");
        phoneNo.add(scanner.nextLong());
        System.out.println("Email :");
        Email.add(scanner.next());
        System.out.println("First Name : "+firstName+", Last Name : "+lastname+", City : "+city+", State : "+State+", Zip code : "+Zip+", Email-ID : "+Email+", Phone Number : "+phoneNo);
        
    }


        //calling function from main
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book System System.");
        addPerson();
    }
}
