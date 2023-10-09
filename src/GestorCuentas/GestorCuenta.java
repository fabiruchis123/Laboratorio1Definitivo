/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorCuentas;

import Account.Account;

/**
 *
 * @author maryc
 */
public class GestorCuenta {
  public   Account CrearCuenta(TipoMoneda tipoMoneda){
      if(tipoMoneda==tipoMoneda.COLONES){
          return new Account("Colones") {};
      }else if(tipoMoneda==tipoMoneda.DOLARES){
          return new Account(" Dolares") {};
      }else{
          throw new IllegalArgumentException(" Tipo de moneda invalido");
      }
  }
}
