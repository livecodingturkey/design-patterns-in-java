package org.livecodingturkey.designpatterns.facade;

public class Rabbit implements PetShop{
    @Override
    public void genus() {
        System.out.println("Lepus");

    }

    @Override
    public void price() {
        System.out.println("150 Tl");

    }
}
