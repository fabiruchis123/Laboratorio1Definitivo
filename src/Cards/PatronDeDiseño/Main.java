/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cards.PatronDeDiseño;

import Cards.Dtos.CreditCardDto;

/**
 *
 * @author UTN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     CreditCardDto creditCard = (CreditCardDto) new CreditCardBuilder()
    .setBalance(1000.0)
    .setCreditLimit(5000.0)
    .setNumber("1234-5678-9012-3456")
    .build();
        System.out.println("Se creo con exito la tarjeta");
        
    }
    
}
