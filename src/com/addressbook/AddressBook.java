package com.addressbook;

public class AddressBook {

    public void createAddressBook(){
        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setFirstName("Rahul");
        contactPerson.setLastName("Kumar");
        contactPerson.setAddress("Banka");
        contactPerson.setCity("Patna");
        contactPerson.setState("Bihar");
        contactPerson.setZip(813211);
        contactPerson.setPhoneNumber(993469189);
        contactPerson.setEmail("rahul@123");
        System.out.println(contactPerson);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.createAddressBook();
    }
}
