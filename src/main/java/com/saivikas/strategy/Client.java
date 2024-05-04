package com.saivikas.strategy;

public class Client {
    public static void main(String[] args) {
        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setCardNumber("4111111111111111");
        visaCard.setCardHolderName("Sai Vikas");
        visaCard.setCvv("123");

        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setCardNumber("5111111111111111");
        amexCard.setCardHolderName("Pankaj");
        amexCard.setCvv("456");

        System.out.println("Visa card is valid: " + visaCard.isValid());
        System.out.println("Amex card is valid: " + amexCard.isValid());
    }
}
