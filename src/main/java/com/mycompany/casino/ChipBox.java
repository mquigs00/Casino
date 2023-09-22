/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.ArrayList;
import java.util.HashMap;

import com.mycompany.casino.Chip;

/**
 *
 * @author Matt
 */
public class ChipBox {
    private HashMap<String, Integer> _chipValues;
    private ArrayList<Chip> _whiteChips;
    private ArrayList<Chip> _redChips;
    private ArrayList<Chip> _greenChips;
    private ArrayList<Chip> _blackChips;
    private ArrayList<Chip> _purpleChips;
    private ArrayList<Chip> _orangeChips;
    
    public ChipBox() {
        _chipValues.put("White", 1);
        _chipValues.put("Red", 5);
        _chipValues.put("Green", 25);
        _chipValues.put("Black", 100);
        _chipValues.put("Purple", 500);
        _chipValues.put("Orange", 1000);
        
        _whiteChips = new ArrayList<Chip>();
        _redChips = new ArrayList<Chip>();
        _greenChips = new ArrayList<Chip>();
        _blackChips = new ArrayList<Chip>();
        _purpleChips = new ArrayList<Chip>();
        _orangeChips = new ArrayList<Chip>();
    }
    
    public boolean add() {
        return true;
    }
    
    /**
     * Provide the value that corresponds to the chip's color
     * 
     * @param color
     * @return colorValue: the value associated with the color key. Equals -1 if not a valid color
     */
    public int getChipValue(String color) {
        if (_chipValues.keySet().contains(color)) {
            int colorValue = _chipValues.get(color);
            return colorValue;
        } else {
            System.out.println("Invalid color. Please enter a color in the given set.");
            return -1;
        }
    }
    
    public Chip[] getChips(String color, int num) {
        Chip[] toReturn = new Chip[num];
        switch(color) {
            case "White":
                
                break;
            case "Red":
                //gfdgfd
                break;
            case "Green":
                //gfgsd
                break;
            case "Black":
                //fdsfd
                break;
            case "Purple":
                // hfdg
                break;
            case "Orange":
                // gfdgf
                break;
        }
        
        return toReturn;
    }
    
    public ArrayList<Chip> getWhiteChips() {
        return _whiteChips;
    }
    
    public ArrayList<Chip> getRedChips() {
        return _redChips;
    }
    
    public ArrayList<Chip> getGreenChips() {
        return _greenChips;
    }
    
    public ArrayList<Chip> getBlackChips() {
        return _blackChips;
    }
    
    public ArrayList<Chip> getPurpleChips() {
        return _purpleChips;
    }
    
    public ArrayList<Chip> getOrangeChips() {
        return _orangeChips;
    }
}
