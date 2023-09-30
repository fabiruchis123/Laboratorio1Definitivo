package Cards.Dtos;
/**
 *
 * @author David Duarte Garcia
 */
public class CardDto {
    private String  number;
    private boolean active = true;

    public CardDto(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    } 

}
