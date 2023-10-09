package Transactions.Dtos;

<<<<<<< HEAD
import Account.Account;
=======
<<<<<<< HEAD

=======
import Account.Account;
>>>>>>> desarrollo
>>>>>>> e18f1ac16d2c9abb0519af8035789b9718acc336
import Persons.Customer;
import Transactions.Transaction;
import java.util.Date;

<<<<<<< HEAD
public class WithdrawalDto{
=======

public class WithdrawalDto extends Transaction{
    
    public WithdrawalDto(boolean amount, Account source, Date date, String number, Customer customer) {
        super(amount, source, date, number, customer);
    }
    
>>>>>>> e18f1ac16d2c9abb0519af8035789b9718acc336
      
}
