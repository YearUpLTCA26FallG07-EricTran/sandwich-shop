package com.pluralsight;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //declare price of sandwich
        double basePriceRegular = 5.45;
        double basePricelarge = 8.95;

        System.out.print("Choose size: Regular or Large: ");
        String size = scanner.nextLine();

        double price;
        if (size.equalsIgnoreCase("regular")) {
            price = basePriceRegular;
        } else if (size.equalsIgnoreCase("large")) {
            price = basePricelarge;
        } else {
            System.out.println("Invalid size.");
            return;
        }




        //prompt user for their age
            double discount = 0;

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        //discount formula
        if (age <= 17) {
            discount = price * 0.1;
        } else if (age >= 65) {
            discount = price * 0.2;
            } else {
            discount = 0;
            }
        double total = price - discount;

        System.out.println("Your total is: " + String.format("%.2f",total));




        }



    }

