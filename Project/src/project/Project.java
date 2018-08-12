/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author garet
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
// This program is for your name.

package stringvars;

import java.util.Scanner; 

 class StringVariables {
    
    public static void main(String[] args) {
         
        Scanner user_input = new Scanner(System.in);
        
        String first_name;
        System.out.print("Enter your first name: ");
        first_name = user_input.next();
        
        String middle_name;
        System.out.print("Enter your middle name: ");
        middle_name = user_input.next();
        
        String last_name;
        System.out.print("Enter your last name: ");
        last_name = user_input.next();
        
        String full_name;
        full_name = last_name + "," + first_name + middle_name;
        
        System.out.println("You are " + full_name);
        
    }
  
}
