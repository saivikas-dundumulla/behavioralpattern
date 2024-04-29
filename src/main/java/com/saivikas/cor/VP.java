package com.saivikas.cor;

import static com.saivikas.cor.RequestType.PURCHASE;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (PURCHASE.equals(request.requestType()) && request.amount() < 1500) {
            System.out.println("VP can handle this reqeust");
        } else {
            successor.handleRequest(request);
        }
    }
}
