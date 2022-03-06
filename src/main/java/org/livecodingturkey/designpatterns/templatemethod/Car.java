package org.livecodingturkey.designpatterns.templatemethod;

public abstract class Car {
    protected int wheelCount;
    protected int seatCount;
    protected int skeletonSizeInCm;

    public void build() {
        addSkeleton();
        addWheels();
        addSeats();
    }

    public abstract void addSkeleton();
    public abstract void addWheels();
    public abstract void addSeats();




}

