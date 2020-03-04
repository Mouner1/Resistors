/*
 * Mouner Dabjan 
 * 3/3/2020
 * This program takes a 3 color-coded resistor and prints the value of the resistor in ohms 
 */
package resistors;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // storing the colors in numbered order in an array
        String colors[] = {"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE"};
        // asking the user for their color input
        String input = JOptionPane.showInputDialog(" What is your resistors color code?" + "\n Please seperate each color by a hyphens" + "\n Ex: Red-Orange-Blue");        
        // switching the user's input to all capital letters
        String upperInput = input.toUpperCase();        
        // splitting the value
        String[] colorsInput = upperInput.split("-");
        // creating a double value array to help in the for loop 
        double[] codes = new double[3];
         // checking when the colorsinput is equal to the colors to decide what color the user choose 
        for (int i = 0; i < colorsInput.length; i++) {
            for (int s = 0; s < colors.length; s++) {
                if (colorsInput[i].equals(colors[s])) {
                    codes[i] = (double) (s);
                }
            }
        }
        // performing the calculation to find the resistor's value
        double output = (10 * codes[0] + codes[1]) * Math.pow(10, codes[2]);
        // printing the result to the screen 
        System.out.println("The value of the reistor is " + output + " ohms");
    }

}
