/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.Scanner;

import com.mycompany.casino.Player;

/**
 *
 * @author Matt
 */
public class Casino {
    private String _name;
    private ChipBox _chips;
    private Player _player;
    private Scanner _scan;
    private int _money;
    
    public Casino(String name, Player player, Scanner scan) {
        _name = name;
        _player = player;
        _scan = scan;
        _money = 5000;
        
        // fill the chipbox
    }
    
    public void open() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to " + _name + " Casino! \nin order to play you must purchase chips to wager. Please make your choice below:");
        sellChips();
    }
    
    public void displayChipOptions() {
        System.out.println("White: $1\n"
                         + "Red: $5\n"
                         + "Green: $25\n"
                         + "Black: $100\n"
                         + "Purple: $500\n"
                         + "Orange: $1000");
    }
    
    /**
     * Display the chip prices to the player. Then continually let them pick the color and
     * amount of chips they want until they say they are done or are out of money
     */
    public void sellChips() {
        displayChipOptions();                                   // show the player the prices
        String color = "";
        
        // while the player hasn't said they're done and still has enough money, let them continue to buy more chips
        while (!color.equals("Done") && _player.getMoney() >= 1) {
            // get the color and number choices
            System.out.println("What color chips would you like to purchase (enter Done to exit sale)");
            color = _scan.nextLine();
            System.out.println("How many white chips would you like?");
            int numChips = _scan.nextInt();
            validateSale(color, numChips);
        }
        
        // if the player ran out of money, let them know
        if (_player.getMoney() > 1) {
            System.out.println("Sorry, you don't have enough money to buy any more chips.");
        }
        
    }
    
    /**
     * Determine if the sale is valid:
     *  1. The c
     * @param color
     * @param numChips
     * @return 
     */
    public boolean validateSale(String color, int numChips) {
        boolean isValid = true;
        int chipValue = _chips.getChipValue(color);
        
        // if chip value return -1, the player gave an invalid color
        if (chipValue == -1) {
            System.out.println("Invalid sale: You must enter a valid chip color!");
            isValid = false;
        }
        
        // the number of chips must be at least 1
        if (numChips < 1) {
            System.out.println("Invalid sale: The number of chips must be at least 1!");
            isValid = false;
        }
        
        int totalCost = chipValue * numChips;
        
        // if the total cost is greater than 
        if (_player.getMoney() < totalCost) {
            System.out.println("Invalid Sale: You only have $" + Integer.toString(_player.getMoney()) + "! This purchase = $" + Integer.toString(totalCost));
            isValid = false;
        }
        
        return isValid;
    }
}
