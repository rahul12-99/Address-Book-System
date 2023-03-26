package com.addressbook;

import java.util.ArrayList;
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
    public void editDetails() { // Method to edit details in addressBook;
        System.out.println("enter first name whose contact you want to edit");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for (ContactPerson contactPerson : contact) {
            if (input.equals(contactPerson.getFirstName())) {
                System.out.println("Enter First name to update");
                contactPerson.setFirstName(sc.next());
                System.out.println("Enter Last name to  update");
                contactPerson.setLastName(sc.next());
                System.out.println("Enter Address to  update");
                contactPerson.setAddress(sc.next());
                System.out.println("Enter City to update");
                contactPerson.setCity(sc.next());
                System.out.println("Enter State to update");
                contactPerson.setState(sc.next());
                System.out.println("Enter Zip to update");
                contactPerson.setZip(sc.nextInt());
                System.out.println("Enter Phone number to update");
                contactPerson.setPhoneNumber(sc.nextLong());
                System.out.println("Enter Email to update");
                contactPerson.setEmail(sc.next());
            } else {
                System.out.println("Enter contact not available");
            }
        }
        System.out.println(contact);
    }
    public void deleteContact() { // Method to delete contact using firstName;
        System.out.println("Enter first name whose contact you want delete");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for (int i = 0; i < contact.size(); i++) {
            if (input.equals(contact.get(i).getFirstName())) {
                contact.remove(i);
                break;
            } else {
                System.out.println("Enter details not available");
            }

        }
        System.out.println(contact);
    }
    public void printContactDetail() { //Method to printing details in addressBook;
        System.out.println(contact);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("-*-*-*-*-Welcome to addressBook-*-*-*-*-");
            System.out.println("Enter 1 to add contact");
            System.out.println("Enter 2 to edit contact");
            System.out.println("Enter 3 to print contact");
            System.out.println("Enter 4 to delete contact");
            System.out.println("Enter 5 to exit");
            int button = sc.nextInt();
            switch (button){
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editDetails();
                    break;
                case 3:
                    addressBook.printContactDetail();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                default:
                    b = false;
            }
        }
    }
}
