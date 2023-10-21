package Transactions.Dtos;

import Account.Account;
import Persons.Customer;
import Transactions.Transaction;
import java.util.Date;


public class DepositDto extends Transaction {

    public DepositDto(double amount, Account source, Date date) {
        super(amount, source, date);
        
    }
    

    
    
}
