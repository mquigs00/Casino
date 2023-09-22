/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import com.mycompany.casino.Card;
import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class Deck {
    // member data
    private ArrayList<Card> _cards;
    
    // constructor
    public Deck() {
        _cards = new ArrayList<Card>();
        String[] cardNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
        
        // create all of the cards with an id from 1-13 (Ace to King) and their suit and color
        for (int i = 1; i < 53; i++) {
            if (i < 14) {
                _cards.add(new Card(i, "Clubs", 'B'));
            }
            else if (i >= 14 && i < 27) {
                _cards.add(new Card(i-13, "Spades", 'B'));
            }
            else if (i >= 26&& i < 40) {
                _cards.add(new Card(i-26, "Hearts", 'R'));
            }
            else if (i >= 40) {
                _cards.add(new Card(i-39, "Diamonds", 'R'));
            }
        }
    }
    
    /**
     * Get the length data
     * @return the length of the deck
     */
    public int getLength() {
        return _cards.size();
    }
    
    /**
     * Remove a card from the deck
     * @param index - the index of the card to be removed
     * @return the removed card
     */
    public Card removeCard(int index) {
        return _cards.remove(index);
    }
    
    /**
     * Add a card to the deck
     * @param index - the index to place the new card
     * @param card - 
     */
    public void addCard(int index, Card card) {
        _cards.add(index, card);
    }
    
    public String toString() {
        String toReturn = "Deck: \n";
        for (int i = 0; i < _cards.size(); i++) {
            toReturn += _cards.get(i).toString() + "\n";
        }
        
        return toReturn;
    }
}
