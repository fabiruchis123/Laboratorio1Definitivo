package Cards;


public class CreditCard extends Card{
    private double        balance;
    private double        creditLimit;
    private static double interestRate;

    public CreditCard(double balance, double creditLimit, String number) {
        super(number);
        this.balance = balance;
        this.creditLimit = creditLimit;
    }


    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static double getInterestRate() {
        return interestRate;
    }
    
 
    public boolean makePurchase(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return true;
        } else {
            return false; 
        }
    }
    
        public boolean makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Monto Invalido");
            return false;
        }
        if (amount <= balance) {
            balance -= amount;
         
            return true;
        } else {
         
            return false;
        }
    }   
}
