
package Accounts.Dtos;

import Persons.Customer;


public class AccountDto {
    private String   number;
    double           balance;
    private Customer customer;
    private boolean  active;

    public AccountDto(String number, double balance, Customer customer, boolean active) {
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.active = active;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    
    
}
