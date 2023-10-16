/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cards.PatronDeDiseño;

import Cards.Dtos.CreditCardDto;

/**
 *
 * @author UTN
 */
public class CreditCardBuilder {
    private double balance;
    private double creditLimit;
    private String number;

    public CreditCardBuilder setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public CreditCardBuilder setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }

    public CreditCardBuilder setNumber(String number) {
        this.number = number;
        return this;
    }

    public CreditCardDto build() {
        return new CreditCardDto(balance, creditLimit, number);
    }
}
