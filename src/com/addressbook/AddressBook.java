package com.addressbook;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class AddressBook {

    ArrayList<ContactPerson> contact = new ArrayList<>();

    public void addContact() { // Method to add contact in addressBook;
        System.out.println("Enter How many contacts you want to add");
        Scanner sc = new Scanner(System.in);
        int noOfContact = sc.nextInt();
        for (int i = 1; i <= noOfContact; i++) {
            ContactPerson contactPerson = new ContactPerson();
            System.out.println("Enter First name of " + i + " " + "contact");
            contactPerson.setFirstName(sc.next());
            System.out.println("Enter Last name of " + i + " " + "contact");
            contactPerson.setLastName(sc.next());
            System.out.println("Enter Address of " + i + " " + "contact");
            contactPerson.setAddress(sc.next());
            System.out.println("Enter City of " + i + " " + " contact");
            contactPerson.setCity(sc.next());
            System.out.println("Enter State of " + i + " " + "contact");
            contactPerson.setState(sc.next());
            System.out.println("Enter Zip code of " + i + " " + "contact");
            contactPerson.setZip(sc.nextInt());
            System.out.println("Enter Phone no of " + i + " " + "contact");
            contactPerson.setPhoneNumber(sc.nextLong());
            System.out.println("Enter Email of " + i + " " + "contact");
            contactPerson.setEmail(sc.next());
            // Add details in ArrayList;
            contact.add(contactPerson);
        }
        System.out.println(contact);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
    }
}
