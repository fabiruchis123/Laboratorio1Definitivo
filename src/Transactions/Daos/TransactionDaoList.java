/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transactions.Daos;

import Cruds.Crud;
import Transactions.Dtos.TransactionDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author UTN
 */
public class TransactionDaoList implements Crud<TransactionDto>{
    
    private ArrayList<TransactionDto> ArrayTransaction;
    
    public TransactionDaoList (ArrayList<TransactionDto> ArraysTransaction){
        this.ArrayTransaction= ArraysTransaction;
    }
    
    public boolean create(TransactionDto transaction) {
        if (transaction == null) {
            return false;
        }
        ArrayTransaction.add(transaction);
        return true;
    }
    
    public TransactionDto read(String source , Date fecha) {
       for (TransactionDto transaction : ArrayTransaction) {
        if (transaction.getSource().equals(source) && transaction.getDate().equals(fecha)) {
            return transaction;
         }
       }
        return null;
    }
    
    public List<TransactionDto> readAll() {
        return ArrayTransaction;
    }

    public boolean update(TransactionDto obj) {
        return this.create(obj);
    }

    
    public boolean delete(TransactionDto transac) {
        return ArrayTransaction.remove(transac);
    }

    @Override
    public TransactionDto read(String source) {
        for (TransactionDto transaction : ArrayTransaction) {
        if (transaction.getSource().equals(source)){
            return transaction;
         }
       }
        return null;
    }
    
    public TransactionDto read(Date fecha) {
        for (TransactionDto transaction : ArrayTransaction) {
        if (transaction.getDate().equals(fecha)){
            return transaction;
         }
       }
        return null;
    }
    
    
}
