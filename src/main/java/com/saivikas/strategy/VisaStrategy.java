package com.saivikas.strategy;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = creditCard.getCardNumber().startsWith("4") && creditCard.getCardNumber().length() == 16;
        return isValid && luhnCheck(creditCard.getCardNumber());
    }
}
