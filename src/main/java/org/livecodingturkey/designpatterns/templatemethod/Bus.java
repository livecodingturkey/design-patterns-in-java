package org.livecodingturkey.designpatterns.templatemethod;

public class Bus extends Car {
    @Override
    public void addSkeleton() {
        skeletonSizeInCm = 120;
    }

    @Override
    public void addWheels() {
        wheelCount = 4;
    }

    @Override
    public void addSeats() {
        seatCount = 20;
    }
}
