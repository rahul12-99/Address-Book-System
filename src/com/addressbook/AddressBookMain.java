package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    Map<String, AddressBook> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    AddressBook addressBook1 = new AddressBook();


    public void addAddressBook() {
        System.out.println("Enter the name to add address book");
        String newBookName = scanner.next();
        map.put(newBookName, addressBook1);
        System.out.println(newBookName);
    }

    public void displayAddressBook() {
        for (String addressBookName : map.keySet()) {
            System.out.println(addressBookName);
        }
    }

    public void selectAddressBook() {
        displayAddressBook();
        System.out.println("Select name of addressBook!");
        String inputName = scanner.next();
        for (String key : map.keySet()) {
            if (inputName.equals(key)) {
                map.get(inputName).callAddressBook();
            } else {
                System.out.println("Selected name not found!");
            }
        }
    }

    public void deleteAddressBook() {
        displayAddressBook();
        System.out.println("Select name to delete addressBook!");
        String inputName = scanner.next();
        for (String key : map.keySet()) {
            if (inputName.equals(key)) {
                map.remove(key);
            } else {
                System.out.println("Selected name not found!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("-*-*-*-*-*-Welcome To AddressBookDictionary-*-*-*-*-*-");
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean b = true;   // When condition is true goes in while loop and perform operation;
        while (b) {
            System.out.println("Enter what you want to perform!");
            System.out.println("Enter 1 for add addressBook!");
            System.out.println("Enter 2 for operation on addressBook!");
            System.out.println("Enter 3 for delete addressBook!");
            System.out.println("Enter 4 for display addressBook!");
            System.out.println("Enter 5 for exit from addressBook!");
            Scanner scanner1 = new Scanner(System.in);
            int choice = scanner1.nextInt();

            switch (choice) {
                case 1:
                    addressBookMain.addAddressBook();
                    break;
                case 2:
                    addressBookMain.selectAddressBook();
                    break;
                case 3:
                    addressBookMain.deleteAddressBook();
                    break;
                case 4:
                    addressBookMain.displayAddressBook();
                    break;
                default:
                    b = false;
            }
        }
    }
}
