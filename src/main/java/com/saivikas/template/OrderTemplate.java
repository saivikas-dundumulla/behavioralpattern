package com.saivikas.template;

import lombok.Setter;

@Setter
public abstract class OrderTemplate {
    //hook
    public boolean isGift;

    //operation
    public abstract void doCheckOut();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift Wrapped");
    }

    public final void processOrder() {
        doCheckOut();
        doPayment();
        if (isGift) wrapGift();
        else doReceipt();
        doDelivery();
    }
}
