package com.saivikas.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("WEB ORDER");
        OrderTemplate webOrder = new WebOrder();
        webOrder.setGift(true);
        webOrder.processOrder();
        System.out.println("STORE ORDER");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
