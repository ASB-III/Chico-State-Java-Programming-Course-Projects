/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181102;

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
        FileReader fr;
        FileWriter fw;
        char[] buff = new char[512];
        int r = 0;

        try {
            fr = new FileReader("exc_lab.pro");
            fw = new FileWriter("exc.out");
//            while (r != -1) {
            while (true) {
                r = fr.read(buff);
                if (r == -1){
                    break;
                }//end if
//              fw.write(buff);
                System.out.println("r is " + r);
                fw.write(buff, 0, r);
                for (int c = 0; c < r; c++) {
                    System.out.print(buff[c]);
                }// end for
            }//end while
            fr.close();
            fw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
