package com.saivikas.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private ValidationStrategy validationStrategy;

    public CreditCard(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean isValid() {
        return validationStrategy.isValid(this);
    }
}
