/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180914;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GLNN104Lab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        for (int j = 0; j <= 5; j++){
//            System.out.println("Outer loop j = " 
//                    + j);
//            for (int x = 0; x < 7; x += 2){
//                System.out.println("\tj "
//                        + "is " + j +
//                        " and x = " + x);
//            }// end inner loop
////            System.out.println("x is " + x);
//        }//end outer for
        int input;
        String myString;
        Scanner sc = new Scanner(System.in);
        myString = JOptionPane.
                showInputDialog("Gimme a number");
        System.out.println(myString);
        System.out.println("And + 1 = " + myString + 1);
        input = Integer.parseInt(myString);
        System.out.println("input is " + input);
        System.out.println("and add 1 is " 
                + (input + 1));
        System.out.print("Gimme a number => ");
        input = sc.nextInt();
        
    }//end method main

}
