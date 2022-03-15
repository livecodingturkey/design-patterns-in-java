package org.livecodingturkey.designpatterns.adapter;

class PlasticToyDuck implements ToyDuck {
    PlasticToyDuck() {
    }

    public void squeak() {
        System.out.println("Squeak");
    }
}