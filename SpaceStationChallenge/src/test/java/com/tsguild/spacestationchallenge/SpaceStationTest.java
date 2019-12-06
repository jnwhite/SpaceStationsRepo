/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.spacestationchallenge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author white
 */
public class SpaceStationTest {
    
    SpaceStation station = new SpaceStation();
    
    public SpaceStationTest() {
    }
    
    @BeforeEach
    public void setUp() {
        station.listOfVisitors.clear();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class SpaceStation.
     */
    
    // Things to test
    // adding a null --> false
    // adding 7 overlapping astronauts --> false
    // adding 6 overlapping astronatus & 1 non-overallping --> true
    // adding 3 overlapping vehicles --> false
    // adding 2 overlapping vehicles & 1 non-overallping --> true
    // adding 2 vehicles (overlapping) and 6 astronauts (overlapping) --> true
    // adding a bunch of aliens and modules --> true
    
    @Test
    public void testAdd() {
        Visitor visitor1 = new Visitor(VisitorType.ASTRONAUT);
    }
    
}
