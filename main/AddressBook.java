package com.alltopic;

import java.util.Scanner;
import com.alltopic.*;

public class AddressBook {
		
	public static void main(String[] args) {
        String fname,lname,address,city,state,zip,phone;
        System.out.println("Welcome To Address Book");
        System.out.println("Enter First Name");
        fname=InputUtil.getStringValue();
        System.out.println("Enter Last Name");
        lname=InputUtil.getStringValue();
        System.out.println("Enter Address");
        address=InputUtil.getStringValue();
        System.out.println("Enter City");
        city=InputUtil.getStringValue();
        System.out.println("Enter State");
        state=InputUtil.getStringValue();
        System.out.println("Enter Zip");
        zip=InputUtil.getStringValue();
        System.out.println("Enter phone number");
        phone=InputUtil.getStringValue();
    }
}	
