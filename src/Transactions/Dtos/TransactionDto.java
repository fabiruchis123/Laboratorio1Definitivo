package Transactions.Dtos;

import Account.Account;
import java.util.Date;


public abstract class TransactionDto{
    private double amount;
    private Account source;
    private Date    date;

    public TransactionDto(double amount, Account source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    } 

    public double getAmount() {
        return amount;
    }

    
   
}
