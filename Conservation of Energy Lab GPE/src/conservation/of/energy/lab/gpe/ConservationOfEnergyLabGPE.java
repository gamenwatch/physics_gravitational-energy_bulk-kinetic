/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conservation.of.energy.lab.gpe;

import java.util.Scanner;

/**
 *
 * @author Jacob1
 */
public class ConservationOfEnergyLabGPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner keyedInput = new Scanner(System.in);
    
    ///////////////////GPE///////////////////////    
        
        //Input Mass
        double mass;
        //System.out.println("What is mass?");
        //mass = keyedInput.nextDouble();
        mass = 0.100; // in the lab
        
        //Input Height
        double height;
        System.out.println("What is the height?");
        height = keyedInput.nextDouble();
        
        //Calculation
        double gpe;
        gpe = mass*height*9.8;
        
        //Output
        System.out.println("GPE: "+gpe);
    
    //////////////////Bulk Kinetic//////////////////

        //Mass
        double mass2 = 0.596;//kg
        
        //Input Velocity
        double velocity;
        System.out.println("What is the velocity?");
        velocity = keyedInput.nextDouble();
        
        //Calculation
        double bke;
        bke = 0.5*0.596*(velocity*velocity);
        
        //Output
        System.out.println("BKE: "+bke);
        
    ///////////////////TOTAL ENERGY/////////////////////
        
        double total = bke + gpe;
        System.out.println("\nTotal Energy: "+total);
        
        
        
    }
    
}
