/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.Scanner;
import java.util.ArrayList;

import com.mycompany.casino.Blackjack;
import com.mycompany.casino.Player;
import com.mycompany.casino.Deck;
import com.mycompany.casino.Card;
import com.mycompany.casino.Dealer;

/**
 *
 * @author Matt
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, would you like to enter the casino? Enter 1 for yes");
        int decision = scan.nextInt();
        
        if (decision == 1) {
            System.out.println("Enter your name below:");
            String name = scan.nextLine();
            Player player = new Player(name);
            Casino myCasino = new Casino("Matt's", player, scan);
            
        } else {
            System.out.println("Okay, have a nice day.");
        }
        
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, would you like to enter the casino?");
        String decision = scan.nextLine();
        System.out.println("Enter your name below:");
        String name = scan.nextLine();
        Player player = new Player(name);
        Player[] players = new Player[1];
        players[0] = player;
        Blackjack bj = new Blackjack(players);
        bj.play();
        */
        
        /*
        Deck deck1 = new Deck();
        System.out.println(deck1.toString());
        Dealer dealer1 = new Dealer();
        deck1 = dealer1.shuffleCards(deck1);
        System.out.println(deck1.toString());
        */
    }
}
