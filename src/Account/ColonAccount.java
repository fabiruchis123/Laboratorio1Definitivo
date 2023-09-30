package Account;

import Persons.Customer;

/**
 *
 * @author David Duarte Garcia
 */
public class ColonAccount extends Account {

    public ColonAccount(String number, double balance, Customer customer) {
        super(number, balance, customer);
    }

    public ColonAccount(String number, Customer customer) {
        super(number, customer);
    }
    
   
    
    public boolean transfer(Account destination, double amount){
      return this.transfer(destination, amount);
    }
    
}
