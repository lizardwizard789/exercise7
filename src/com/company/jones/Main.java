package com.company.jones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ContactInfo person1=new ContactInfo("give me your persons name", "give mer there amil address");


        ContactInfo person2=new ContactInfo("give me your next persons name", "give mer there amil address");
        ContactInfo person3=new ContactInfo("give me your other next persons name", "give mer there amil address");

        System.out.println("ok so im gonna print all three people you made now in the next couple of fractions of a second");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());


        System.out.println("now we look at business contacts");
        BusinessContact person4 =new BusinessContact("give me the business neaem", "give me a business email", "give me a business phone number");
        System.out.println(person4.toString());

    }




}
