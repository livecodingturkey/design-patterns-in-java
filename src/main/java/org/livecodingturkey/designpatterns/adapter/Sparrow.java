package org.livecodingturkey.designpatterns.adapter;

class Sparrow implements Bird {
    Sparrow() {
    }

    public void fly() {
        System.out.println("Flying");
    }

    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
