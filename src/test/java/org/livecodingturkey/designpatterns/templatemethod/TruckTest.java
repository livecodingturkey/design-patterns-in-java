package org.livecodingturkey.designpatterns.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {

    @Test
    public void it_should_build_truck(){
         Car truck = new Truck();
         truck.build();
         assertEquals(truck.seatCount, 2);
         assertEquals(truck.wheelCount, 16);
         assertEquals(truck.skeletonSizeInCm, 305);
    }
}