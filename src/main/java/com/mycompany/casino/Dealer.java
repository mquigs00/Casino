/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.ArrayList;
import java.util.Random;

import com.mycompany.casino.Card;
import com.mycompany.casino.Deck;
import com.mycompany.casino.Player;

/**
 *
 * @author Matt
 */
public class Dealer {
    // member data
    private ArrayList<Card> _cards;
    
    public Dealer() {
        _cards = new ArrayList<Card>();
    }
    
    /**
     * Perform a series of shuffling techniques to mix up the order of the playing deck
     * 
     * @param deck
     * @return deck - the shuffled deck
     */
    public Deck shuffleCards(Deck deck) {
        deck = overhandShuffle(deck);
        deck = splitDeck(deck);
        return deck;
    }
    
    /**
     * Split the dick in half (remove the first half), then re-insert the cards in alternating indices
     * 
     * @param deck
     * @return deck - the shuffled deck
     */
    public Deck splitDeck(Deck deck) {
        int numCards = deck.getLength();
        Card[] secondStack = new Card[26];
        
        // add all the cards in the first half of the deck to a new array
        for (int i = 0; i < 26; i++) {
            secondStack[i] = deck.removeCard(0);
        }
        
        // add the separated cards back in alternating indices
        for (int i = 2; i < numCards+2; i+=2) {
            // deck.addCard[0, secondStack[0]
            // deck.addCard[2, secondStack[1]
            // deck.addCard[4, secondStack[2]
            deck.addCard(i-2, secondStack[(i/2)-1]);
        }
        
        return deck;
    }
    
    /**
     * Start at a random index in the first half of the deck, remove the card at that index plus a small random number
     * of cards behind it and move them all to the front one by one
     * 
     * @param deck
     * @return deck - the shuffled deck
     */
    public Deck overhandShuffle(Deck deck) {
        // get the length of the duck
        int numCards = deck.getLength();
        Random rand = new Random();
        
        int numShuffles = rand.nextInt(15);
        int i = 0;
        
        // shuffle the cards a random number of times less than 15. Select a card in the first half of the deck along with a random
        // number of cards in front of it (less than 11) and move them to the front of the deck each time
        while (i < numShuffles) {
            int firstIndex = rand.nextInt(numCards/2);
            int groupSize = rand.nextInt(11);
            
            int j = 0;
            while (j < groupSize) {
                Card cardToBeMoved = deck.removeCard(firstIndex);
                deck.addCard(0, cardToBeMoved);
                j++;
            }
            i++;
        }
        
        return deck;
    }
    
    /**
     * Deal each player a card from the front of the deck, then remove one for the dealer
     * 
     * @param players
     * @param deck 
     */
    public void dealCards(Player player, Deck deck) {
        player.receiveCard(deck.removeCard(0));
        _cards.add(0, deck.removeCard(0));
    }
    
    /**
     * Give a player a new card when they decide to hit
     * 
     * @param player
     * @param deck 
     */
    public void dealNewCard(Player player, Deck deck) {
        Card nextCard = deck.removeCard(0);
        System.out.println(player.getName() + " receives:\n" + nextCard.toString());
        player.receiveCard(nextCard);
    }
    
    /**
     * Pick a card out of the dealer's personal card stack
     * 
     * @param index
     * @return the dealer's card at the given index
     */
    public Card getCard(int index) {
        return _cards.get(index);
    }
    
    /**
     * Once cards have been dealt, display all of the players hands and the dealers top card
     */
    public void displayHands(Player player) {
        player.displayCards();
        
        // display the dealer top card
        System.out.println("The dealer's top card is \n" + _cards.get(0));
    }
    
    /**
     * After a player's turn, check their score and reveal it to console
     * @param player 
     */
    public void checkPlayerScore(Player player) {
        int score = 0;
        
        // loop through all the players cards, summing up their values
        for (Card card: player.getCards()) {
            // if (card is a number card) - add its number value
            if (card.getId() > 1 && card.getId() < 11) {
                score += card.getId();
            } else if (card.getId() > 10) {
                score += 10;
            } else if (card.getId() == 1) {
                if (score + 11 > 21) {
                    score += 1;
                } else {
                    score += 11;
                }
            }
        }
        
        System.out.println(player.getName() + " now has a score of : " + Integer.toString(score));
    }
}
