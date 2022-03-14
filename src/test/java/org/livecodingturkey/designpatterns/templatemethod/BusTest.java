package org.livecodingturkey.designpatterns.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusTest {

    @Test
    public void it_should_build_bus(){
         Car bus = new Bus();
         bus.build();
         assertEquals(bus.seatCount, 20);
         assertEquals(bus.wheelCount, 4);
         assertEquals(bus.skeletonSizeInCm, 120);
    }
}