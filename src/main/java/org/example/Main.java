package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
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
        try{
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter description of deposit: ");
           String description = scanner.nextLine();
           System.out.println("Enter vendor name: ");
           String vendor = scanner.nextLine();
           System.out.println("Enter amount: ");
           double amount = scanner.nextDouble();
           LocalDate now = LocalDate.now();
           LocalTime nowTime = LocalTime.now();
           System.out.println("deposit information: "+ now +"|" + nowTime + "|" + description + "|" + vendor + "|" + amount);

               FileWriter fileWriter = new FileWriter("src/main/resources/transactions.csv", true);
               fileWriter.write(now + "|" + nowTime +"|" + description + "|" + vendor + "|" + amount + "\n");
               fileWriter.close();
           } catch(IOException exception){


           }

       }
       public static void payment(){
           try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter description of payment: ");
        String description = scanner.nextLine();
        System.out.println("Enter vendor name: ");
        String vendor = scanner.nextLine();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
           LocalDate now = LocalDate.now();
           LocalTime nowTime = LocalTime.now();
           System.out.println("deposit information: "+ now +"|" + nowTime + "|" + description + "|" + vendor + "|" + amount);
           FileWriter fileWriter = new FileWriter("src/main/resources/transactions.csv", true);
           fileWriter.write(now + "|" + nowTime +"|" + description + "|" + vendor + "|" + amount + "\n");
           fileWriter.close();
       } catch(IOException exception){


    }
    }
        public static String ledger(){
        return "";
        }
        public static String exit(){
        return "";
        }

}
