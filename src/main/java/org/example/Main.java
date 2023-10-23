package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Home screen: ");
        System.out.println("D): Make a deposit");
        System.out.println("P): Make a payment");
        System.out.println("L): See ledger");
        System.out.println("X): Exit application");


            String userInput = scanner.nextLine();
            switch (userInput) {
                case "D":
                    deposit();
                    break;
                case "P":
                    payment();
                    break;
                case "L":
                    //display ledger screen
                    break;
                case "X":
                    System.out.println("Thank you!");

                default:
                    System.out.println("Please pick from our menu items! ");
            }
        }
       public static void deposit (){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter description of deposit: ");
           scanner.nextLine();
           System.out.println("Enter vendor name: ");
           scanner.nextLine();
           System.out.println("Enter amount: ");
           scanner.nextLine();
       }
       public static void payment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter description of payment: ");
        scanner.nextLine();
        System.out.println("Enter vendor name: ");
        scanner.nextLine();
        System.out.println("Enter amount: ");
        scanner.nextLine();

       }
        public static String ledger(){
        return "";
        }
        public static String exit(){
        return "";
        }

}
