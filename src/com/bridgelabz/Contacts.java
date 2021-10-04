package com.bridgelabz;
import jdk.internal.icu.impl.NormalizerImpl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author:-Sunanda Shil
 * date:-03/10/2021
 */

public class Contacts
{

    private static Contact contact;
    private static NormalizerImpl.ReorderingBuffer firstName;

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
    public static void editPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name you want to edit...");
        String editName = scanner.next();
        System.out.println("What do you want to edit \n" +
                "1. First Name / 2. Last Name / 3. Address / 4. City / " +
                "5. State / 6. Zip code / 7. Phone Number / 8. Email");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter new First Name");
                String newFirstName = scanner.next();
                contact.setFirstName(newFirstName);
                break;

            case 2:
                System.out.println("Enter new Last Name");
                String newLastName = scanner.next();
                contact.setLastName(newLastName);
                break;

            case 3:
                System.out.println("Enter new Address");
                String newAddress = scanner.next();
                contact.setAddress(newAddress);
                break;

            case 4:
                System.out.println("Enter new City");
                String newCity = scanner.next();
                contact.setCity(newCity);
                break;

            case 5:
                System.out.println("Enter new State");
                String newState = scanner.next();
                contact.setState(newState);
                break;

            case 6:
                System.out.println("Enter new Zip code");
                int newZip = scanner.nextInt();
                contact.setZip(newZip);
                break;

            case 7:
                System.out.println("Enter new Phone Number");
                long newPhoneNo = scanner.nextLong();
                contact.setPhoneNo(newPhoneNo);
                break;

            case 8:
                System.out.println("Enter new Email");
                String newEmail = scanner.next();
                contact.setEmail(newEmail);
                break;
        }
        public static void removePerson() {

            System.out.println("Enter a name you want to delete...");
            String removeName = scanner.next();
            for (int i=0; i<contact.size();i++)

            contact.remove(i);

        }
    }





        //calling function from main
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book System System.");
        addPerson();
        editPerson();
        removePerson();
    }
}
