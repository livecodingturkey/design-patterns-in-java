package org.livecodingturkey.designpatterns.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTests {

    @Test
    void test1() {
         Main m = new Main();
        String str = m.test();
        assertEquals("hello world", str);
    }

}
