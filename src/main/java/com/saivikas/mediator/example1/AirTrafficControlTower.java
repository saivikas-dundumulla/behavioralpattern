package com.saivikas.mediator.example1;

public interface AirTrafficControlTower {
    void requestTakeoff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
