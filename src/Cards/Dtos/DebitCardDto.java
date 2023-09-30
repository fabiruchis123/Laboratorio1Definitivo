package Cards.Dtos;

import Account.Account;



/**
 *
 * @author David Duarte Garcia
 */
public class DebitCardDto extends CardDto {
     private Account account;

    public DebitCardDto(Account account, String number) {
        super(number);
        this.account = account;
    }
    
    public Account getAccount() {
        return account;
    }
}
