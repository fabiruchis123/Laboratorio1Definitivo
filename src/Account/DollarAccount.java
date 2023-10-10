package Account;

import Persons.Customer;


public class DollarAccount extends Account{
    private static double exchangeRate;

    public DollarAccount(String number, double balance, Customer customer) {
        this(number, balance, customer, " Dolares");
    }

    public DollarAccount(String number, double balance, Customer customer, String _Dolares) {
        super(number, balance, customer);
    }

    public DollarAccount(String number, Customer customer) {
        super(number, customer);
    }

    public static double getExchangeRate() {
        return exchangeRate;
    }

    public static void setExchangeRate(double exchangeRate) {
        DollarAccount.exchangeRate = exchangeRate;
    }
    
    
    public boolean transfer(){
      return false; //Falta programarlo           
    }
    
}
