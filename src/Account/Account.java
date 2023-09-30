package Account;


import Persons.Customer;
import StatusControll.StatusControll;

public abstract class Account implements StatusControll{
    private String   number;
    double           balance;
    private Customer customer;
    private boolean  active = true;

    public Account(String number, double balance, Customer customer) {
        this.number   = number;
        this.balance  = balance;
        this.customer = customer;
        this.active   = active;
    }
    
    public Account(String number,Customer customer) {
        this.number   = number;
        this.balance  = 0;
        this.customer = customer;
        this.active   = active;
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

    public boolean isActive() {
        return active;
    }

    
    public boolean deposit(double amount){
        if (amount > 0) {
            this.balance = this.balance + amount;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean withdraw( double amount){
        if (amount > 0 && amount <= this.balance) {
            this.balance = this.balance - amount;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transfer(Account destination, double amount){
         if (amount > 0 && amount <= this.balance) {
            this.balance = this.balance - amount;
            destination.deposit(amount);
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void activate(Class obj) {
        this.active = true;
    }

    @Override
    public void desactivate(Class obj) {
        this.active = false;
    }
    
}
