package org.livecodingturkey.designpatterns.facade;

public class Main {
  ShopKeeper keeper = new ShopKeeper();
  Dog d=keeper.DogSale();
  Cat c =keeper.CatSale();
  Rabbit r=keeper.RabbitSale();
}
