/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181126;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.folks.Simpsons;

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
        BufferedReader bfr = null;
        Scanner sc;
        // local variables
        String input;
        String inName;
        long inAge, inSalary, inIQ;
        Simpsons simp;

        try {
            bfr = new BufferedReader(
                    new FileReader("Folks.csv"));
            while ((input = bfr.readLine())
                    != null) {
                sc = new Scanner(input);
                sc.useDelimiter("\\s*,\\s*");
                try {
                    inName = sc.next();
                    inAge = sc.nextLong();
                    inSalary = sc.nextLong();
                    inIQ = sc.nextLong();
                    simp = new Simpsons(inName,
                            inAge, inSalary, inIQ);
                    System.out.println(simp);
                } catch (Exception ex) {
                    //write to file
                    System.out.println(input);
                }
            }// end while
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
