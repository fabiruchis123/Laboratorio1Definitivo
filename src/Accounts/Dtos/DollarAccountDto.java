
package Accounts.Dtos;

import Persons.Customer;

public class DollarAccountDto extends AccountDto{
       private static double exchangeRate;    
    
    public static double getExchangeRate() {
        return exchangeRate;
    }

    public DollarAccountDto(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }
    
}
