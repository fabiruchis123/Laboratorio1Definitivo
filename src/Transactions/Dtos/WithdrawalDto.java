package Transactions.Dtos;


import Account.Account;
import Persons.Customer;
import Transactions.Transaction;
import java.util.Date;


public class WithdrawalDto extends Transaction{
    
    public WithdrawalDto(boolean amount, Account source, Date date, String number, Customer customer) {
        super(amount, source, date, number, customer);
    }
    
      
}
