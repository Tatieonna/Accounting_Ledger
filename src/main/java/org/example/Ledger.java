package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ledger {

    private ArrayList<Transaction> transactions;
    public Ledger(){
        this.transactions= new ArrayList<Transaction>();

    }

    public void addTransaction (Transaction transaction) {
        transactions.add(transaction);
    }
    public void readFromCSV() {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/transactions.csv");
            Scanner scanner = new Scanner(fis);
            scanner.nextLine();
            while (scanner.hasNextLine()){
                String input = scanner.nextLine();
                String[] line = input.split("\\|");
                String date = line[0];
                String time = line [1];
                String description= line [2];
                String vendor = line [3];
                Double amount = Double.parseDouble(line[4]);
                Transaction transaction = new Transaction(date, time, description, vendor, amount);
                transactions.add(transaction);
                System.out.println(transaction);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Uh oh - something went wrong! :( ");

        }
    }

    public void displayAllTransactions(){
        for (Transaction transaction: transactions){
            System.out.println(transaction);
        }
    }
    public void displayAllDeposits() {
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() > 0 ){
                System.out.println(transaction);

        }
    }

    }
    public void displayAllPayments (){
        for (Transaction transaction: transactions){
            if (transaction.getAmount()< 0){
                System.out.println(transaction);
            }
        }
    }

    }