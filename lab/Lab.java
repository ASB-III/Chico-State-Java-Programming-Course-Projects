/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int cents;
        String choice;
        choice = "y";
        Scanner sc = new Scanner(System.in);
        int q, d, n, p;

        System.out.println("Welcome to the Change Calculator");

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("\nenter number of cents (0-99) : ");

            cents = sc.nextInt();
            q = cents / 25;
            cents = cents % 25;
            d = cents / 10;
            cents %= 10;
            n = cents / 5;
            cents %= 5;
            p = cents / 1;
            cents %= 1;

            System.out.println("\nQuarters:" + q
                    + "\nDimes:" + d
                    + "\nNickels" + n
                    + "\ncents" + p);

            System.out.println("\nContinue? (y/n): ");
            choice = sc.next();

        } // while statement //
    }

}