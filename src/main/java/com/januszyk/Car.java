package com.januszyk;

class Car {
    private boolean started = true;

    void startEngine() {
        this.started = true;
    }

    void stopEngine() {
        this.started = false;
    }

    boolean isStarted() {
        return this.started;
    }
}
