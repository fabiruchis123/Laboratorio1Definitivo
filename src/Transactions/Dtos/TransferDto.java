package Transactions.Dtos;

import Account.Account;
import Transactions.Transaction;
import java.util.Date;


public class TransferDto extends Transaction{

    private Account destination;
    public TransferDto(Account destination ,double amount, Account source, Date date) {
        super(amount, source, date);
        this.destination = destination;
    }

    
    
}
