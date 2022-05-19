/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180917;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            // put your program code here

            System.out.print("Do you want to go "
                    + "again? ");
            choice = sc.next();
        } while (choice.substring(0, 1).
                equalsIgnoreCase("Y"));
        System.out.print("Enter a number => ");
        int x = sc.nextInt();
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println("");
        int z = 23;
//      error assigning float to int
//        z = 123.4;
        
        
    }// end method main
    

}
