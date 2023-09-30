package Transactions;

import Account.Account;
import Persons.Customer;
import java.util.Date;

/**
 *
 * @author David Duarte Garcia
 */
public class Transfer extends Transaction {
    private Account destination;

  

    public Transfer(Account destination, boolean amount, Account source, Date date, String number, Customer customer) {
        super(amount, source, date, number, customer);
        this.destination = destination;
    }

    
    
    public boolean execute(){
        return true;
    }

    
}
