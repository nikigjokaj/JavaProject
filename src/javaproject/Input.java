/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.Scanner;

/**
 *
 * @author nikigjokaj
 */
public class Input {

    private transient Scanner input;

    public Input() {
        input = new Scanner(System.in);
    }
    
    public String getString() {
        return input.nextLine();
    }
    
    public int getInt() {
        return Integer.parseInt(input.nextLine());
    }
    
    public double getDouble() {
        return Double.parseDouble(input.nextLine());
    }
}
