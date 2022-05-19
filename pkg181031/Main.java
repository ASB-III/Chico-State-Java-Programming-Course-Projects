/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181031;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        char[] data = new char[512];
        File inFile = new File("exc_lab.pro");
        System.out.println("Exists? "
                + inFile.exists());
        System.out.println("Can read? "
                + inFile.canRead());
        System.out.println("Can write? "
                + inFile.canWrite());
        try {
            int j = 0;
            FileReader fr
                    = new FileReader(inFile);
            while (j != -1) {
                j = fr.read(data);
                System.out.println("J is " + j);
                for (int c = 0; c < /*512*/ j; c++) {
                    System.out.print(data[c]);
                }//end print loop
            }//end while
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//end method main

}// end class Main
