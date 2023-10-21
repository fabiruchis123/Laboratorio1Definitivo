package Transactions;

import Account.Account;
import Persons.Customer;
import java.util.Date;


public class Deposit extends Transaction {


    public Deposit(double amount, Account source, Date date) {
        super(amount, source, date);
    }
    
    public boolean execute(){
            if (getAmount() > 0) {
                Account sources = getSource();
                sources.deposit(getAmount());
            return true;
        }else{
            return false;
        }
    }
    
}
