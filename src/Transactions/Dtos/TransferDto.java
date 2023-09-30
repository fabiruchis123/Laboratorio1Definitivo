package Transactions.Dtos;

import Account.Account;


public class TransferDto{
    private Account destination;

    public TransferDto(Account destination) {
        this.destination = destination;
    } 
}
