package com.saivikas.mediator.example1;

public class CommercialAirplane implements Airplane{
    private final AirTrafficControlTower controlTower;

    public CommercialAirplane(AirTrafficControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void requestTakeoff() {
        controlTower.requestTakeoff(this);
    }

    @Override
    public void requestLanding() {
        controlTower.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Commercial Airplane:" + message);
    }
}
