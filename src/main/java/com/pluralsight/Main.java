package com.pluralsight;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder adressInfo = new StringBuilder();

        System.out.println("Enter your billing and shipping adress.");

        //Get Billing
        System.out.println("Full name: ");
        String fullName = input.nextLine();

        System.out.println("Billing street: ");
        String billingStreet = input.nextLine();

        System.out.println("Billing City: ");
        String billingCity = input.nextLine();

        System.out.println("Billing State: ");
        String billingState = input.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = input.nextLine();

        //Get Shipping


        System.out.println("Shipping street: ");
        String shippingStreet = input.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = input.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = input.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = input.nextLine();


        //formating output
        adressInfo.append("Adress Information");
            adressInfo.append("===================\\n\\n");
            adressInfo.append("Full name: ").append(fullName).append("\n\n");
            adressInfo.append("Billing Adress\n");
            adressInfo.append("----------------\n");
            adressInfo.append("Street: ").append(billingStreet).append("\n");
            adressInfo.append("City: ").append(billingCity).append("\n");
            adressInfo.append("State: ").append(billingState).append("\n");
            adressInfo.append("Zip: ").append(billingZip).append("\n\n");
            adressInfo.append("Shipping Adress\n");
            adressInfo.append("----------------\n");
            adressInfo.append("Street: ").append(shippingStreet).append("\n");
            adressInfo.append("City: ").append(shippingCity).append("\n");
            adressInfo.append("State: ").append(shippingState).append("\n");
            adressInfo.append("Zip: ").append(shippingZip).append("\n");

        System.out.println("\n" + adressInfo.toString());




    }
}
