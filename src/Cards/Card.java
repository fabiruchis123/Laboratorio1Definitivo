package Cards;

import StatusControll.StatusControll;

/**
 *
 * @author David Duarte Garcia
 */
public abstract class Card implements StatusControll {
    private String  number;
    private boolean active = true;
    

    public Card(String number) {
        this.number = number;
    }
     

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }
    
    
    @Override
    public void activate(Class obj) {
       this.active = true;
    }

    @Override
    public void desactivate(Class obj) {
       this.active = false;
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
