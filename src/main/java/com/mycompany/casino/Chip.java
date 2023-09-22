/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

/**
 *
 * @author Matt
 */
public class Chip {
    public int _value;
    private String _color;
    
    public Chip(int value) {
        _value = value;
    }
    
    public int getValue() {
        return _value;
    }
    
    public String getColor() {
        return _color;
    }
}
