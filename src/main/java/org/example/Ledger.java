package org.example;

public class Ledger {
    public String allEntries;
    public String deposits;
    public String payments;
    public String reports;

    public Ledger(String allEntries, String deposits, String payments, String reports) {
        this.allEntries = allEntries;
        this.deposits = deposits;
        this.payments = payments;
        this.reports = reports;
    }

    public String getAllEntries() {
        return allEntries;
    }

    public void setAllEntries(String allEntries) {
        this.allEntries = allEntries;
    }

    public String getDeposits() {
        return deposits;
    }

    public void setDeposits(String deposits) {
        this.deposits = deposits;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }
}
