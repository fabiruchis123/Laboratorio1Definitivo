/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transactions.Daos;

import Cruds.Crud;
import Observer.Observer;
import Transactions.Dtos.TransactionDto;
import Transactions.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author UTN
 */
public class TransactionDaoList implements Crud<TransactionDto>{
    
    private Transaction tans;
    private ArrayList<TransactionDto> ArrayTransaction;
    private List<Observer> observadores = new ArrayList<>();
    private boolean estado;
    
    public boolean getEstado(){
        return this.estado;
    }
    public TransactionDaoList (ArrayList<TransactionDto> ArraysTransaction){
        this.ArrayTransaction= ArraysTransaction;
    }
    
    public boolean create(TransactionDto transaction) {
        if (transaction == null) {
            setEstado(false);
            return false;
        }
        ArrayTransaction.add(transaction);
        setEstado(true);
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
    
    public void setEstado(boolean estado) {
        this.estado = estado;
        notifyObservers();
    }

    public void addObserver(Observer observador) {
        observadores.add(observador);
    }

    public void removeObserver(Observer observador) {
        observadores.remove(observador);
    }

    private void notifyObservers() {
        for (Observer observador : observadores) {
            observador.notificar();
        }
    }
    
    
}
