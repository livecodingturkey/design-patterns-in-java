package org.livecodingturkey.designpatterns.adapter;

class BirdAdapter implements ToyDuck {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        this.bird.makeSound();
    }
}
