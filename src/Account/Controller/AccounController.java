/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account.Controller;

import Account.Account;
import Accounts.Dtos.AccountDto;
import Controller.Controller;
import Dao.Dao;

import Views.View;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UTN
 */
public class AccounController implements Controller<Account>{
    
    private View view;
    private Dao dao;

    public AccounController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    
    
    @Override
    public boolean create(Account Account) {
          if (dao.read(Account.getNumber()) != null){
            view.displayMessage("Cuenta ya existe");
            return false;
        }else{
            //Validar Integridad 
            AccountDto accountDto = new AccountDto(Account.getNumber(), Account.getBalance(), Account.getCustomer(), Account.isActive());
            if (dao.create(accountDto)){
               view.displayMessage("Se agrego correctamente");
               return true;
            }else{
                view.displayMessage("Error al agregar");
                 return false;
            } 
        }
    }

    @Override
    public Account read(String id) {
        AccountDto accountDto = (AccountDto) dao.read(id);
        if(accountDto==null){
            view.displayMessage("No se encontro la cuenta");
            return null;
        }else{
            Account account = new Account(accountDto.getNumber(), accountDto.getBalance(),accountDto.getCustomer()) {};
            view.display(account);
            return account;
        }
        
    }

    @Override
    public List<Account> readAll() {
        ArrayList<Account> accountList = new ArrayList();
        List<AccountDto> accountDtoList = dao.readAll();
        
        if(accountDtoList.isEmpty()){
            view.displayMessage("No se encontraron cuentas");
        }else{
            for(AccountDto accountDto : accountDtoList){
                Account account = new Account(accountDto.getNumber(), accountDto.getBalance(), accountDto.getCustomer()) {};
                accountList.add(account);
            }
        }
        
        return accountList;
    }

    @Override
    public boolean update(Account account) {
        
        AccountDto accountDtoe = (AccountDto) dao.read(account.getNumber());
        if(accountDtoe == null){
            view.display("Cuenta no encontrada");
            return false;
        }else{
            AccountDto accountDtoup = new AccountDto(account.getNumber(), account.getBalance(), account.getCustomer(), account.isActive());
            if(dao.update(accountDtoup)){
                view.displayMessage("Cuenta Actualizada correctamente");
                return true;
            }else{
                view.displayMessage("Error al actualizar cuenta");
                return false;
            }
        }
    }

    @Override
    public boolean delete(Account account) {
        AccountDto accountdto = (AccountDto) dao.read(account.getNumber());
        if(accountdto == null){
            view.displayMessage("Cuenta no encontrada");
            return false;
        }else{
            if(dao.delete(account.getNumber())){
                view.displayMessage("Cuenta eliminda exitosamente");
                return true;
            }else{
                view.displayMessage("Error no se pudo eliminar la cuenta");
                return false;
            }
        }
    }
    
}
