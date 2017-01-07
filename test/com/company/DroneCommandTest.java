package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Олександр on 07.01.2017.
 */
class DroneCommandTest extends DroneCommand {
    DroneCommandTest(){
        super(1,Type.DELIVER,0);
    }

    @BeforeEach
    void clear(){
        cargo.clear();
    }

    @Test
    void testLoad() {
        type = Type.LOAD;
        droneId = 0;
        targetId = 1;
        cargo.put(2,3);
        assertEquals("0 L 1 2 3", getDescription());
    }

    @Test
    void testDeliver() {
        type = Type.DELIVER;
        droneId = 0;
        targetId = 1;
        cargo.put(2,3);
        assertEquals("0 D 1 2 3", getDescription());
    }

    @Test
    void testUnload() {
        type = Type.UNLOAD;
        droneId = 3;
        targetId = 9;
        cargo.put(2,3);
        cargo.put(0,1);
        assertEquals("3 U 9 0 1 2 3", getDescription());
    }

    @Test
    void testWait() {
        type = Type.WAIT;
        droneId = 3;
        targetId = 3;
        assertEquals("3 W 3", getDescription());
    }
}