/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transactions.Controller;

import Controller.Controller;
import Dao.Dao;
import Persons.Customer;
import Transactions.Deposit;
import Transactions.Dtos.DepositDto;
import Transactions.Dtos.TransactionDto;
import Transactions.Transaction;
import Views.View;
import java.util.List;

/**
 *
 * @author UTN
 */
public class TransactionController implements Controller<Transaction> {

    private View view;
    private Dao dao;
    
    public TransactionController(View view,Dao dao){
        this.view = view;
        this.dao = dao;
    }
    
    
    
    public boolean create(Transaction tran, Customer cust) {
        if (tran instanceof Deposit) {
            Deposit deposit = (Deposit) tran;
            Deposit depo = new DepositDto(deposit.isAmount(),deposit.getSource(),deposit.getDate(),,);
        }
        return false;
        
    }

    @Override
    public Transaction read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Transaction> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Transaction tran) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Transaction tran) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean create(Transaction obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
