package Transactions;

import Account.Account;
import Persons.Customer;
import java.util.Date;

/**
 *
 * @author David Duarte Garcia
 */
public class Deposit extends Transaction {


    public Deposit(boolean amount, Account source, Date date, String number, Customer customer) {
        super(amount, source, date, number, customer);
    }

   
    
    public boolean execute(){
        return true;
    }
    
}
