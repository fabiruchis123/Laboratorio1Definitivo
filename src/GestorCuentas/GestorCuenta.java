/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorCuentas;

import Account.Account;
import Account.ColonAccount;
import Account.DollarAccount;
import Persons.Customer;

/**
 *
 * @author maryc
 */
public class GestorCuenta {
  public   Account CrearCuenta(String number, double balance, Customer customer, TipoMoneda tipoMoneda){
      if(tipoMoneda==tipoMoneda.COLONES){
          return new ColonAccount(number, balance, customer, "COLONES");
      }else if(tipoMoneda==tipoMoneda.DOLARES){
          return new DollarAccount(number,balance,customer, "DOLARES");
      }else{
          throw new IllegalArgumentException(" Tipo de moneda invalido");
      }
  }
  
  
}
