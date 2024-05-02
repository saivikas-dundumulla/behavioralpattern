package com.saivikas.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ChatRoom();
        User rahul = new User(subject);
        User pankaj = new User(subject);
        User manoj = new User(subject);

        rahul.addMessage("Hi all");
        pankaj.addMessage("Hi rahul");
    }
}
