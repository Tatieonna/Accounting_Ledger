package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    //I made this public static outside of main because I'm using it in all methods and not just in main.
    public static Ledger ledger= new Ledger();
    public static void main(String[] args) {
        ledger.readFromCSV();
        while(true) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Home screen: ");
            System.out.println("D): Make a deposit");
            System.out.println("P): Make a payment");
            System.out.println("L): See ledger");
            System.out.println("X): Exit application");


            String userInput = scanner.nextLine();
            switch (userInput.toUpperCase()) {
                case "D":
                    depositMenu();
                    break;
                case "P":
                    paymentMenu();
                    break;
                case "L":
                    ledgerMenu();
                    break;
                case "X":
                    System.out.println("Thank you!");

                default:
                    System.out.println("Please pick from our menu items! ");
            }
        }
        }
       public static void depositMenu(){
        try{
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter description of deposit: ");
           String description = scanner.nextLine();
           System.out.println("Enter vendor name: ");
           String vendor = scanner.nextLine();
           System.out.println("Enter amount: ");
           double amount = scanner.nextDouble();
           LocalDate today = LocalDate.now();
           LocalTime nowTime = LocalTime.now();

           Transaction deposit = new Transaction(today.toString(),nowTime.toString(),description,vendor,amount);
           ledger.addTransaction(deposit);


           System.out.println("deposit information: "+ today +"|" + nowTime + "|" + description + "|" + vendor + "|" + amount);

               FileWriter fileWriter = new FileWriter("src/main/resources/transactions.csv", true);
               fileWriter.write(today + "|" + nowTime +"|" + description + "|" + vendor + "|" + amount + "\n");
               fileWriter.close();
           } catch(IOException exception){


           }

       }
       public static void paymentMenu(){
           try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter description of payment: ");
        String description = scanner.nextLine();
        System.out.println("Enter vendor name: ");
        String vendor = scanner.nextLine();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        amount= -amount;

           LocalDate today = LocalDate.now();
           LocalTime nowTime = LocalTime.now();

               Transaction payment = new Transaction(today.toString(),nowTime.toString(),description,vendor,amount);
               ledger.addTransaction(payment);

           System.out.println("deposit information: "+ today +"|" + nowTime + "|" + description + "|" + vendor + "|" + amount);
           FileWriter fileWriter = new FileWriter("src/main/resources/transactions.csv", true);
           fileWriter.write(today + "|" + nowTime +"|" + description + "|" + vendor + "|" + amount + "\n");
           fileWriter.close();
       } catch(IOException exception){


    }
    }
        public static String ledgerMenu(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Your Ledger ");
            System.out.println("A): Display all entries ");
            System.out.println("D): Display deposits");
            System.out.println("P): Display payments");
            System.out.println("R): Reports");

            String userInput = scanner.nextLine();
            switch(userInput.toUpperCase()){
                case "A":
                    ledger.displayAllTransactions();
                    break;
                case "D":
                    ledger.displayAllDeposits();
                    break;
                case "P":
                    ledger.displayAllPayments();
                    break;
                case "R":
                    //new screen "reports"

            }

        return "";
        }
        public static String exit(){
        return "";
        }

}
