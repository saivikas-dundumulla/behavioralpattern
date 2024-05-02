package com.saivikas.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class ChatRoom extends Subject {
    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String state) {
        messageHistory.add(state);
        notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
