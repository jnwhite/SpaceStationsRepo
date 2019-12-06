/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.spacestationchallenge;

import java.util.List;

/**
 *
 * @author white
 */
public class SpaceStation {
    List<Visitor> listOfVisitors;
    
    public boolean add (Visitor v) {
    // returns true if there's enough room 
    // for v's type and data range, start - end,
    // else false
    
    if(v == null) {
        return false;
    }
    
    if (v.getType() == VisitorType.VEHICLE) {
        int counter = 0;
        for (Visitor vis : listOfVisitors) {
            if (counter >= 2) {
                return false;
            }
            if (vis.getType() == VisitorType.VEHICLE
                    && (((v.getStart().compareTo(vis.getStart()) >= 0)
                            && (v.getStart().compareTo(vis.getEnd()) <= 0))
                        ||((v.getEnd().compareTo(vis.getStart()) >= 0)
                            && (v.getEnd().compareTo(vis.getEnd()) <= 0)))) {
                counter++;
            }
        }
        listOfVisitors.add(v);
        return true;
    }
    
    if (v.getType() == VisitorType.ASTRONAUT) {
        int counter = 0;
        for (Visitor vis : listOfVisitors) {
            if (counter >= 6) {
                return false;
            }
            if (vis.getType() == VisitorType.ASTRONAUT
                    && (((v.getStart().compareTo(vis.getStart()) >= 0)
                            && (v.getStart().compareTo(vis.getEnd()) <= 0))
                        ||((v.getEnd().compareTo(vis.getStart()) >= 0)
                            && (v.getEnd().compareTo(vis.getEnd()) <= 0)))) {
                counter++;
            }
        }
        listOfVisitors.add(v);
        return true;
    }
    
    return true;
}
    
//    private static boolean checkVisitorList(Visitor test, List<Visitor> list) {
//    }
    
}
