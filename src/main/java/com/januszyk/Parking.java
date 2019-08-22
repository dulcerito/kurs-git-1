package com.januszyk;

class Parking {

    private Car parkedCar;

    void park(Car car) {
        if (this.parkedCar != null) {
            throw new IllegalStateException("Parking is busy");
        }

        this.parkedCar = car;
    }

    boolean isBusy() {
        return this.parkedCar != null;
    }

    Car unpark() {
        Car car = this.parkedCar;
        this.parkedCar = null;
        return car;
    }
}
