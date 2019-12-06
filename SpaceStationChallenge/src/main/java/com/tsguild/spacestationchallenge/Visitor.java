/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.spacestationchallenge;

import java.time.LocalTime;

/**
 *
 * @author white
 */
public class Visitor {
    
    private LocalTime start;
    private LocalTime end;
    private VisitorType type;
    private String name;

    public Visitor(VisitorType type) {
        this.type = type;
    }
    
    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public VisitorType getType() {
        return type;
    }

    public void setType(VisitorType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
