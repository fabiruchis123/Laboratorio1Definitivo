package Transactions.Dtos;

import Account.Account;


/**
 *
 * @author David Duarte Garcia
 */
public class TransferDto{
    private Account destination;

    public TransferDto(Account destination) {
        this.destination = destination;
    } 
}
