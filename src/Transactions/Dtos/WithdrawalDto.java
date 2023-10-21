package Transactions.Dtos;

import Account.Account;
import Persons.Customer;
import Transactions.Transaction;
import java.util.Date;


public class WithdrawalDto extends Transaction{
    
    public WithdrawalDto(double amount, Account source, Date date) {
        super(amount, source, date);
    }
    
    
}
