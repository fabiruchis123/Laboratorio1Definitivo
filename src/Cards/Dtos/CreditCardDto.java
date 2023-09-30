package Cards.Dtos;
/**
 *
 * @author David Duarte Garcia
 */
public class CreditCardDto extends CardDto {
    private double        balance;
    private double        creditLimit;
    private static double interestRate;

    public CreditCardDto(double balance, double creditLimit, String number) {
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
}
