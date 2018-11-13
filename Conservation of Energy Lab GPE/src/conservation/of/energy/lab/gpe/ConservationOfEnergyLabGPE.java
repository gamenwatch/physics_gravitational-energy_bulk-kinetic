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
        
        //Input Mass
        double mass;
        mass = keyedInput.nextDouble();
        
        //Input Height
        double height;
        height = keyedInput.nextDouble();
        
        //Calculation
        double gpe;
        gpe = mass*height*9.8;
        
        //Output
        System.out.println(gpe);
        
    }
    
}
