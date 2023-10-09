package Cards;

import Account.Account;
import Persons.Customer;


public class DebitCard extends Card {
    private Account account;

    public DebitCard(Account account, String number) {
        super(number);
        this.account = account;
    }
    
    public Account getAccount() {
        return account;
    }
  
   public boolean makePurchase(double amount, double balance) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false; 
        }
    }     
}
