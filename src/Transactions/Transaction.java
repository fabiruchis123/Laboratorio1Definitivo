package Transactions;

import Account.Account;
import java.util.Date;


public abstract class Transaction{
    private double amount;
    private Account source;
    private Date    date;

    public Transaction(double amount, Account source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }
    
    public boolean execute(){
        return true;
    }
   
}
