package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Purpose : To create address book
 *
 * @author Sachin Kore
 * @version 16.0
 * @since 2021-10-27
 */
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBookMain addressBookMain = new AddressBookMain();
        AddressBookMain.createContact();
    }

    /**
     * purpose : To take all the details of contact person
     */
    public static void createContact() {
        Contacts contacts = new Contacts();
        contacts.setFirstName("Sachin");
        contacts.setLastName("kore");
        contacts.setAddress("hinjewadi");
        contacts.setCity("pune");
        contacts.setState("MH");
        contacts.setZip(411057);
        contacts.setPhoneNumber(999999999);
        contacts.setEmail("SK7@gmail.com");
    }
    public boolean validateName(String name) {
        Contacts contacts = new Contacts();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(contacts.getFirstName());
        boolean b = matcher.matches();
        if (contacts.getFirstName().isEmpty())
            return false;
        return b;
    }
}
