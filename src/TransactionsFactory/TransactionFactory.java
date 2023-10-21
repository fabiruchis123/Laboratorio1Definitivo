/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionsFactory;

import Account.Account;
import Persons.Customer;
import Transactions.Deposit;
import Transactions.Transaction;
import Transactions.Transfer;
import Transactions.Withdrawal;
import static TransactionsFactory.TipoTransactions.DEPOSITO;
import static TransactionsFactory.TipoTransactions.RETIRO;
import static TransactionsFactory.TipoTransactions.TRANSFERENCIA;
import java.util.Date;

/**
 *
 * @author UTN
 */
public class TransactionFactory {
    public Transaction crearTransaction(Account destination,double amount,Account source,Date date,TipoTransactions tipo){
        if (tipo == DEPOSITO) {
            return new Deposit(amount,source,date);
        }
        if(tipo == TRANSFERENCIA){
            return new Transfer(destination,amount,source,date);
        }
        if (tipo == RETIRO) {
            return new Withdrawal(amount,source,date);
            
        }else{
            throw new IllegalArgumentException("Tipo de transaccion invalida, intente de nuevo");
        }
    }
}
