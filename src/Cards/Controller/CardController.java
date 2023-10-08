/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cards.Controller;

import Cards.Card;
import Cards.CreditCard;
import Cards.DebitCard;
import Cards.Dtos.CardDto;
import Controller.Controller;
import Dao.Dao;
import Views.View;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UTN
 */
public class CardController implements Controller<Card>{

    private View view;
    private Dao dao;

    public CardController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    
    
    @Override
    public boolean create(Card card) {
    if (dao.read(card.getNumber()) != null) {
        view.displayMessage("Tarjeta ya existe");
        return false;
    } else {
        if (card instanceof CreditCard) {
            CreditCard creditCard = (CreditCard) card;
            CardDto cardDto = new CardDto(creditCard.getNumber());
            if (dao.create(cardDto)) {
                view.displayMessage("Tarjeta de crédito agregada correctamente");
                return true;
            } else {
                view.displayMessage("Error al agregar tarjeta de crédito");
                return false;
            }
        } else if (card instanceof DebitCard) {
            DebitCard debitCard = (DebitCard) card;
            CardDto cardDto = new CardDto(debitCard.getNumber());

            if (dao.create(cardDto)) {
                view.displayMessage("Tarjeta de débito agregada correctamente");
                return true;
            } else {
                view.displayMessage("Error al agregar tarjeta de débito");
                return false;
            }
        } else {
            view.displayMessage("Tipo de tarjeta no reconocido");
            return false;
        }
    }
}
    @Override
    public Card read(String id) {
        CardDto cardto = (CardDto) dao.read(id);
        if(cardto == null){
            view.displayMessage("No se encontro la tarjeta");
            return null;
        }else{
            Card card = new Card(cardto.getNumber()){};
            view.display(card);
            return card;
        }
    }

    @Override
    public List<Card> readAll() {
        ArrayList<Card> cardList = new ArrayList<>();
        List<CardDto> cardtoList = dao.readAll();
        
        if(cardtoList.isEmpty()){
            view.displayMessage("No se encontraron tarjetas");
        }else{
            for(CardDto cardto : cardtoList){
                Card card = new Card (cardto.getNumber()) {};
                cardList.add(card);
            }
        }
        return cardList;
        
    }

    @Override
    public boolean update(Card card) {
        
        CardDto cardtoe = (CardDto) dao.read(card.getNumber());
        if(cardtoe == null){
            view.displayMessage("Cuenta no encontrada");
            return false;
        }else{
            CardDto cardtoup = new CardDto(card.getNumber());
            if(dao.update(cardtoup)){
               view.displayMessage("Tarjeta actualizada correctamente");
            return true;
            }else{
                view.displayMessage("Error al actualizr");
                return false;
            }
            
        }
    }

    @Override
    public boolean delete(Card card) {
        CardDto cardDto = (CardDto) dao.read(card.getNumber());
        if(cardDto == null){
            view.displayMessage("Cuenta no encontrada");
            return false;
        }else{
            if(dao.delete(card.getNumber())){
                view.displayMessage("Cuenta Eliminada Correctamente");
                return true;
            }else{
                view.displayMessage("Ocurrio un error a la hora de eliminar la cuenta");
                return false;
            }
        }
        
    }
    
}
