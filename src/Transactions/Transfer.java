package Transactions;

import Account.Account;
import java.util.Date;


public class Transfer extends Transaction {
    private Account destination;

  

    public Transfer(Account destination, double amount, Account source, Date date) {
        super(amount, source, date);
        this.destination = destination;
    }

    public boolean execute(){
        Account sources = getSource();
        if (getAmount() > 0 && getAmount() <= sources.getBalance() ) {
            sources.transfer(destination, getAmount());
            return true;
        }else{
            return false;
        }
    }

    
}
