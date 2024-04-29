package com.saivikas.cor;

public class Client {
    public static void main(String[] args) {
        Director charlie = new Director();
        VP beta = new VP();
        CEO alpha = new CEO();

        beta.setSuccessor(alpha);
        charlie.setSuccessor(beta);

        Request request1 = new Request(RequestType.CONFERENCE, 200);
        charlie.handleRequest(request1);
        Request request2 = new Request(RequestType.PURCHASE, 800);
        charlie.handleRequest(request2);
        Request request3 = new Request(RequestType.PURCHASE, 2000);
        charlie.handleRequest(request3);
    }
}
