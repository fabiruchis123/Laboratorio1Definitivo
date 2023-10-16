/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cards.PatronDeDiseño;

import Cards.Dtos.CardDto;

/**
 *
 * @author UTN
 */
public interface CardFactory {
    CardDto createCard(double balance, double creditLimit, String number);
}
