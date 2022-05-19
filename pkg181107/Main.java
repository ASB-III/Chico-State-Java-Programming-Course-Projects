/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        FileReader fr;
        int r;
        char[] c = new char[512];
        BufferedReader bfr;
        BufferedWriter bfw;
        String input;

        try {
            fr = new FileReader("exc_lab.pro");
            while ((r = fr.read(c)) != -1) {
                for (int i = 0; i < r; i++) {
                    System.out.print(c[i]);
                }// end for

            }//end while

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }// end FileReader
        try {
            bfr = new BufferedReader(
                    new FileReader("Folks.csv"));
            bfw = new BufferedWriter(
                    new FileWriter("bfw.out"));
            while ((input = bfr.readLine())
                    != null) {
                System.out.println(input);
                bfw.write(input);
                bfw.newLine();
            }//end bfr while
            bfr.close();
            bfw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
