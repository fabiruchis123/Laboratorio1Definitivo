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

/**
 *
 * @author UTN
 */
public class CrearCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorCuenta cuentas = new GestorCuenta();

        
        for (int i = 1; i <= 7; i++) {
            Account cuentaColones = cuentas.CrearCuenta(TipoMoneda.COLONES);
            System.out.println("Cuentas disponibles en colones"+ cuentaColones);
        }

        for (int i = 1; i <= 7; i++) {
            Account cuentaDolares = cuentas.CrearCuenta(TipoMoneda.DOLARES);
            System.out.println("Cuentas disponibles en dolares"+ cuentaDolares);
        }
    }
    
}
