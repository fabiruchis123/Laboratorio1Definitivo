/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transactions.Controller;

import Controller.Controller;
import Dao.Dao;
import Observer.Observer;
import Persons.Customer;
import Transactions.Deposit;
import Transactions.Dtos.DepositDto;
import Transactions.Dtos.TransferDto;
import Transactions.Transaction;
import Transactions.Transfer;
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
    
    
    
    public boolean create(Transaction tran, Customer cust, String strig) {
        
        if (tran instanceof Deposit) {
            DepositDto depo = new DepositDto (tran.isAmount(),tran.getSource(),tran.getDate(),strig,cust);
            if (dao.create(depo)){
                    view.displayMessage("Se hizo correctamente el deposito");
        }else{
                view.displayMessage("Error en el deposito");
            }
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
