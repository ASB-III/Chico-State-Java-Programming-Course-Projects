/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.folks.Folks;

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
        BufferedWriter bfw = null;
        String input;
        Scanner sc;
        // local variables
        String inName;
        int inAge, inSalary, inIQ;
        Folks mySimpson;
        ArrayList al = new ArrayList();

        try {
            bfr = new BufferedReader(
                    new FileReader("Folks.csv"));
            bfw = new BufferedWriter(
                    new FileWriter("Errors.out"));
            while ((input = bfr.readLine()) != null) {
                sc = new Scanner(input);
                sc.useDelimiter("\\s*,\\s*");

                try {
                    inName = sc.next();
                    inAge = sc.nextInt();
                    inSalary = sc.nextInt();
                    inIQ = sc.nextInt();
                    mySimpson = new Folks(inName,
                            inAge, inSalary, inIQ);
                    al.add(mySimpson);
                } catch (Exception ex) {
                    bfw.write(input);
                    bfw.newLine();
                }//end parse
            }//end read
            bfw.close();
            bfr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
