/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180919;

import my.classroom.Student;

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
        double d = 1.32;
        long i;
        Long x;
        Student jacob;
        
        final double SALES_TAX = .075;
//        lossy conversion
//        i = d;
        i = 54;
//      Widening conversion
        d += i;
        System.out.println("d is " + d);
//      Casting
        i = (int) d;
        System.out.println("i is " + i);
        x = new Long(i);
        System.out.println("Your total is " + 
                (d + d * SALES_TAX));
        jacob = new Student(12345, "Balsz", 
                "Jacob");
        System.out.println(jacob);
        
    }

}
