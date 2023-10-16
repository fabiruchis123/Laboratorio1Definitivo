/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Account.Account;
import Account.ColonAccount;
import Account.DollarAccount;
import GestorCuentas.GestorCuenta;
import GestorCuentas.TipoMoneda;
import Persons.Customer;
import java.sql.Date;

public class CrearCuentas {

 
    public static void main(String[] args) {
        
        Customer customer = new Customer(new Date(1999,2,29),"UNO@Gmail.com","A la par de la casa de JP","1-2222-3333","JeanCarlos");
        GestorCuenta cuentas = new GestorCuenta();

        
        for (int i = 1; i <= 7; i++) {
            Account cuentaColones = cuentas.CrearCuenta("1122",1000.0,customer,TipoMoneda.COLONES);
            System.out.println("Cuentas disponibles en colones"+ cuentaColones);
        }

        for (int i = 1; i <= 7; i++) {
            Account cuentaDolares = (DollarAccount) cuentas.CrearCuenta("1122",1000.0,customer,TipoMoneda.COLONES);
            System.out.println("Cuentas disponibles en dolares"+ cuentaDolares);
        }
    }
    
}
