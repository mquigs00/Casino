/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.Scanner;
import java.util.HashMap;

import com.mycompany.casino.Dealer;
import com.mycompany.casino.Deck;
import com.mycompany.casino.Player;

/**
 *
 * @author Matt
 */
public class Blackjack {
    // member data
    private Dealer _dealer;
    private Deck _deck;
    private Player _player;
    private HashMap<Integer, Integer> _cardValues;
    boolean _isComplete;
    
    // constructor
    public Blackjack(Player player) {
        _player = player;
        _isComplete = false;
        _deck = new Deck();
        _dealer = new Dealer();
    }
    
    public void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Blackjack. Best of luck!");
        System.out.println("The Dealer is shuffling the cards");
        _deck = _dealer.shuffleCards(_deck);
        
        System.out.println("The Dealer is giving each player two cards, including themself");
        _dealer.dealCards(_player, _deck);
        _dealer.dealCards(_player, _deck);
        
        _dealer.displayHands(_player);
        System.out.println("Would you like to pass or hit? Enter 0 for pass or 1 for hit");
        int decision = scan.nextInt();
        
        // the player elects to pass
        if (decision == 0) {
            System.out.println("Passed");
        } else if (decision == 1) {
            _dealer.dealNewCard(_player, _deck);
            _dealer.checkPlayerScore(_player);
        }
        
        //while (!_isComplete) {
            // deal two to each player
            //_dealer.dealCards(_players, _deck);
            
            
            // ask player if he wants to hit or pass
            // if player went over 21, house wins
            // if player passed while under 21, dealer 
    }
}
