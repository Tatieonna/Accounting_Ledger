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
        switch (userInput){
            case "D":
                System.out.println("Enter deposit information");
                break;
            case "P":
                System.out.println("Enter debit information");
                break;
            case "L":
                //display ledger screen
                break;
            case "X":
                System.out.println("Thank you!");


        }

        }
       public static String deposit (){
        return
       }
       public static String payment(){
        return
       }
        public static String ledger(){
        return
        }
        public static String exit(){
        return
        }

}
