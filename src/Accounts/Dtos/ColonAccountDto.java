
package Accounts.Dtos;

import Persons.Customer;


public class ColonAccountDto extends AccountDto{

    public ColonAccountDto(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }
    
    
    
}
