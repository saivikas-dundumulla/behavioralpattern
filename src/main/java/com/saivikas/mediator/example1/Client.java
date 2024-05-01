package com.saivikas.mediator.example1;

public class Client {
    public static void main(String[] args) {
        AirTrafficControlTower controlTower = new AirportControlTower();

        // Instantiate Concrete Colleagues (Commercial Airplanes)
        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        // Set up the association between Concrete Colleagues and the Mediator
        airplane1.requestTakeoff();         //Event is triggered by the colleague and colleague notifies the mediator and mediator takes appropriate actions.
        airplane2.requestLanding();
    }
}
