package Transactions;

import Account.Account;
import Persons.Customer;
import java.util.Date;


public class Withdrawal extends Transaction {

   

    public Withdrawal(double amount, Account source, Date date) {
        super(amount, source, date);
    }

   
   
    public boolean execute(){
        Account sources = getSource();
        if (getAmount() > 0 && getAmount() <= sources.getBalance()) {
            sources.withdraw(getAmount());
            return true;
        }else{
            return false;
        }
    }
    
}
