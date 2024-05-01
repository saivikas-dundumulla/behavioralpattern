package com.saivikas.mediator.example1;

public interface Airplane {
    void requestTakeoff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
