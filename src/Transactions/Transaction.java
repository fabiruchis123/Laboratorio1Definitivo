package Transactions;

import Account.Account;
import Persons.Customer;
import java.util.Date;


public abstract class Transaction{
    private boolean amount;
    private Account source;
    private Date    date;



    public Transaction(boolean amount, Account source, Date date, String number, Customer customer) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

  

    public boolean isAmount() {
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
