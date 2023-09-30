package Cards.Daos;

import Cards.Dtos.CardDto;
import Cruds.Crud;
import Persons.Dtos.UserDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author David Duarte Garcia
 */
public class CardDaoList implements Crud<CardDto> {
    private HashMap<String, CardDto> cardList;

    public CardDaoList(HashMap<String, CardDto> cardList) {
        this.cardList = cardList;
    }
    

    @Override
    public boolean create(CardDto card) {
        if (card == null) {
          return false;  
        }
         cardList.put(card.getNumber(), card);
         return true; 
    }

    @Override
    public CardDto read(String id) {
         return cardList.get(id);
    }

    @Override
    public List<CardDto> readAll() {
       return new ArrayList<CardDto>(cardList.values());
    }

    @Override
    public boolean update(CardDto card) {
          return this.create(card);
    }

    @Override
    public boolean delete(CardDto card) {
        return cardList.remove(card.getNumber()) != null;
    } 
}
