package com.saivikas.state;
//Context
public class Fan {
    private State fanLowState;
    private State fanOffState;
    private State fanMedState;
    private State fanHighState;
    private State state;

    public Fan() {
        this.fanLowState = new FanLowState(this);
        this.fanOffState = new FanOffState(this);
        this.fanMedState = new FanMedState(this);
        this.fanHighState = new FanHighState(this);
        this.state = this.fanOffState;
    }

    public void pullChain(){
        state.handle();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }
}
