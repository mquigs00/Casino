/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.Scanner;

import com.mycompany.casino.Player;
import com.mycompany.casino.RouletteTile;

/**
 *
 * @author Matt
 */
public class Roulette {
    private Player[] _players;
    private RouletteTile[] _wheel;
    
    public Roulette(Player[] players) {
        _players = players;
        _wheel = new RouletteTile[38];
        _wheel[0] = new RouletteTile(0, 'G');
        _wheel[37] = new RouletteTile(38, 'G');
        
        for (int i = 1; i < 37; i++) {
            // alternate colors for the first ten. Odds = red, evens = blue
            if (i < 11) {
                if (i % 2 == 1) {
                    _wheel[i] = new RouletteTile(i, 'R');   // odds are red
                } else {
                    _wheel[i] = new RouletteTile(i, 'B');   // evens are black
                }
            } else if (i >= 11 && i < 19) {
                if (i % 2 == 1) {
                    _wheel[i] = new RouletteTile(i, 'B');   // odds are black
                } else {
                    _wheel[i] = new RouletteTile(i, 'R');   // evens are red
                }
            } else if (i >= 19 && i < 29) {
                if (i % 2 == 1) {
                    _wheel[i] = new RouletteTile(i, 'R');   // odds are red
                } else {
                    _wheel[i] = new RouletteTile(i, 'B');   // evens are black
                }
            } else if (i >= 29) {
                if (i % 2 == 1) {
                    _wheel[i] = new RouletteTile(i, 'R');   // odds are red
                } else {
                    _wheel[i] = new RouletteTile(i, 'B');   // evens are black
                }
            }
        }
    }
    
    public void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Roulette. Best of Luck");
        
    }
}
