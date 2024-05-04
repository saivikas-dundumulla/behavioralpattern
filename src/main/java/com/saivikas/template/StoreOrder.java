package com.saivikas.template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckOut() {
        System.out.println("Get items from the cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment at the store");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag the item at the store");
    }
}
