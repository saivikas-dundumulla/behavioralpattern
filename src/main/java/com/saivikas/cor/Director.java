package com.saivikas.cor;

import static com.saivikas.cor.RequestType.CONFERENCE;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (CONFERENCE.equals(request.requestType())) {
            System.out.println("Director can handle this request");
        } else {
            successor.handleRequest(request);
        }
    }
}
