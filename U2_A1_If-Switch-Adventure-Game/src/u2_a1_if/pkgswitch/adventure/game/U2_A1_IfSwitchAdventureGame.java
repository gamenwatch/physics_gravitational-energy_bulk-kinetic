/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_a1_if.pkgswitch.adventure.game;

import java.util.Scanner;

/**
 * Jacob L
 * Oct 17, 2018
 * Runs a choose your own adventure game
 */
public class U2_A1_IfSwitchAdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare Scanner
        Scanner keyedInput = new Scanner(System.in);

        //Variables
        int pathChoice;
        
        // Introduction
        System.out.println("Welcome to the ~Tale of Jim the Noble~ , a choose your own adventure game.");
        System.out.println("You will presented with a number of options. Please respond with one of the possible choices.\n");
        System.out.println("~Starts~ \n");
        System.out.println("Your an average noble for an acient medival kingdom. You have decided to go for a drink.");
        System.out.println("A little time has passed, and you have seemed to have angered a nearby noble from a higher familly.\n");
        System.out.println("What did you do?");
        System.out.println("(1) You said something / (2) You did something");
        pathChoice = keyedInput.nextInput();
        
    }
    
}
