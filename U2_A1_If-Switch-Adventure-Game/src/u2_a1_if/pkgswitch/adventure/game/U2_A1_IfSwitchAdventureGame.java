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
        int choiceOne;
        int choiceTwo;
        int choiceThree;
        
        // Introduction
        System.out.println("Welcome to the ~Tale of Jim the Noble~ , a choose your own adventure game.");
        System.out.println("You will presented with a number of options. Please respond with one of the possible choices.\n");
        System.out.println("~Starts~ \n");
        System.out.println("Your an average noble for an acient medival kingdom. You have decided to go for a drink.");
        System.out.println("A little time has passed, and you have seemed to have angered a nearby noble from a higher familly.\n");
        
        System.out.println("What did you do?");
        System.out.println("(1) You said something / (2) You did something");
        pathChoice = keyedInput.nextInt();
        
        //Diverging Paths
        if (pathChoice == 1) {
            //Cyrano Path
            //System.out.println("Cyrano Path Chosen");
            System.out.println("\nYou memory clears and you remember what you did to anger him.\nIt was because you mumored that he was a sot. Appearently he heard you...");
            System.out.println("You follow him outside, and he draws his sabre. How do you respond?");
            System.out.println("\n(1)Compose a scalding poem (2)Pick aparts his flaws with a verbal barrage (3)Do nothing.");
            choiceOne = keyedInput.nextInt();
            
            //Diverging Paths
            switch (choiceOne) {
                case 1:
                    System.out.println("Thou smelleth quite bad, you belch out.");
                    System.out.println("\nThe noble laughs it off. Appearently he does not appriciate fine verse...");
                    System.out.println("\n You raise your fists in preperation for a fight...");
                    System.out.println("You rush foward with a unknown fury. You swing widely and completly wiff.");
                    System.out.println("\tYour vision goes dark...");
                    System.out.println("\nWho brings nothing to a sword fight?");
                    
                case 2:
                    System.out.println("You tear into him, insulting his nose, face, and cloths with dynamic discorse.");
                    System.out.println("\nThe noble bursts out into tears and runs away.");
                    System.out.println("\nFeelsGoodMan");
                
                case 3:
                    System.out.println("A cat litterally comes by and grabs your tongue.");
                    System.out.println("Distacted you are left a easy target.");
                    System.out.println("\nPlan to suceed or plan to fail as they say!");
            }
            
        }
        else if (pathChoice == 2) {
            //Honor Path
            //System.out.println("Honor Path Chosen");
            System.out.println("\nYou memory clears and you remember what you did to anger him.\nYou obviously bumped into him in a druken stupor...");
            System.out.println("You follow him outside, and he draws his sabre. How do you respond?");
            System.out.println("\n(1)Grab a fire stoker (2)Grab a broom (3)Dont grab anything");
            choiceTwo = keyedInput.nextInt();
            
            //Diverging Paths
            switch (choiceTwo) {
                case 1:
                    System.out.println("You pick the nearest sharper object. Unfortunately, that was a fire stocker.");
                    System.out.println("\nYou square up with your enemy. You must quickly make a move.");
                    System.out.println("\nDo you try to disarm him? (1)Yes (2)No");
                    choiceThree = keyedInput.nextInt();
                        switch (choiceThree) {
                            case 1:
                                System.out.println("\nThe hook of the staff catches the sabre, and you strike him");
                                System.out.println("YOU WIN!!!");
                            case 2:
                                System.out.println("\nYou throw it like a spear, hitting the bystanders.");
                                System.out.println("Enjoy jail you psychopath.");
                        }
                    
                case 2:
                    System.out.println("You square off with the noble by doing cool staff trips.");
                    System.out.println("\nThe noble won't take you seriously, and leaves.");
                    System.out.println("\nYou win?");
                
                case 3:
                    System.out.println("\n You raise your fists in preperation for a fight...");
                    System.out.println("You rush foward with a unknown fury. You swing widely and completly wiff.");
                    System.out.println("\tYour vision goes dark...");
                    System.out.println("\nWho brings nothing to a sword fight?");
            }
            
        }
        else {
            System.out.println("THIS IS NOT AN OPTION. Reload and try again.");
        }
    }
    
}
