package com.saivikas.mediator.example1;

public class AirportControlTower implements AirTrafficControlTower{
    @Override
    public void requestTakeoff(Airplane airplane) {
        airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        airplane.notifyAirTrafficControl("Requesting landing clearance.");
    }
}
