package com.company.jones;

import java.util.Scanner;

public class BusinessContact extends ContactInfo{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BusinessContact(String message1, String message2, String message3) {
        super(message1, message2);
        System.out.println(message3);
        Scanner input= new Scanner(System.in);

        this.phoneNumber = input.nextLine();
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "business phoneNumber='" + phoneNumber + '\'' +
                "}  business email: "+this.getEmail()+"} business neame: "+this.getName()+'}';
    }
}
