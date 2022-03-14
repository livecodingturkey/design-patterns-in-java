package org.livecodingturkey.designpatterns.templatemethod;

public class Truck extends Car {
    @Override
    public void addSkeleton() {
        skeletonSizeInCm = 305;
    }

    @Override
    public void addWheels() {
        wheelCount = 16;
    }

    @Override
    public void addSeats() {
        seatCount = 2;
    }
}
