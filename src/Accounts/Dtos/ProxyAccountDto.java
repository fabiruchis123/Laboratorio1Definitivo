/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accounts.Dtos;

import Persons.Customer;

/**
 *
 * @author maryc
 */
public class ProxyAccountDto implements InterfaceAccount {

    private AccountDto account;

    public ProxyAccountDto(String number, double balance, Customer customer, boolean active) {
        if (active) {
            account = new AccountDto(number, balance, customer);
        } else {
            account = null;
        }
    }

    public String getNumber() {
        if (account != null) {
            return account.getNumber();
        }
        return "cuenta inactiva";
    }

    public double getBalance() {
        if (account != null) {
            return account.getBalance();
        }
        return 0.0;
    }

    public Customer getCustomer() {
        if (account != null) {
            return account.getCustomer();
        }
        return null;
    }
}
