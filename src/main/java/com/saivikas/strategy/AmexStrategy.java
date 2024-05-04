package com.saivikas.strategy;

public class AmexStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = creditCard.getCardNumber().startsWith("37") || creditCard.getCardNumber().startsWith("34");
        return isValid && creditCard.getCardNumber().length() == 15 && luhnCheck(creditCard.getCardNumber());
    }
}
