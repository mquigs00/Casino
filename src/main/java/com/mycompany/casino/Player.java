/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.ArrayList;
import com.mycompany.casino.Card;
import com.mycompany.casino.ChipBox;

/**
 *
 * @author Matt
 */
public class Player {
    // member data
    private String _name;
    private ArrayList<Card> _cards;
    private ChipBox _chips;
    private int _money;
    
    public Player(String name) {
        _name = name;
        _money = 100;
        _cards = new ArrayList<Card>();
    }
    
    /**
     * Add a new card to the players pile
     * @param newCard 
     */
    public void receiveCard(Card newCard) {
        _cards.add(newCard);
    }
    
    /**
     * Get the players name
     * @return 
     */
    public String getName() {
        return _name;
    }
    
    /**
     * Get the players cards
     * @return 
     */
    public ArrayList<Card> getCards() {
        return _cards;
    }
    
    public int getMoney() {
        return _money;
    }
    
    /**
     * Display all of the card in the players hand
     */
    public void displayCards() {
        String cardData = "";
        for (Card card: _cards) {
            cardData = cardData.concat(card.toString() + "\n");
        }
        System.out.println(cardData);
    }
}
