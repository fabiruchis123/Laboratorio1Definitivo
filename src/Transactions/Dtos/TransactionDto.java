package Transactions.Dtos;

import Account.Account;
import java.util.Date;


public abstract class TransactionDto{
    private boolean amount;
    private Account source;
    private Date    date;

    public TransactionDto(boolean amount, Account source, Date date) {
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

    public boolean isAmount() {
        return amount;
    }
   
}
