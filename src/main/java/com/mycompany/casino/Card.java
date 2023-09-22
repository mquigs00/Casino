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
public class Card {
    // member data
    private char _color;
    private int _id;
    private String _suit;
    
    public Card(int id, String suit, char color) {
        _id = id;
        _suit = suit;
        _color = color;
    }
    
    public int getId() {
        return _id;
    }
    
    public char getColor() {
        return _color;
    }
    
    public String getSuit() {
        return _suit;
    }
    
    public String toString() {
        return ("Value: " + _id + " Suit: " + _suit + " Color: " + _color);
    }
}
