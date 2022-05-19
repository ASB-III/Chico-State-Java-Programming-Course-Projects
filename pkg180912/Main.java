/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180912;

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
        int numCats = 8;
        System.out.println("There are " + numCats
                + " cats here!");
        System.out.println("There "
                + (numCats == 1 ? "is " : "are ")
                + numCats + " cat"
                + (numCats != 1 ? "s " : " ")
                + "here!");

        int j = 0;
        while (j < 10) {
            System.out.println("j is " + ++j);
        }// end while
        
        do {
            System.out.println("Do loop: j is " + ++j);
        }while(j < 10); // end do loop
        
        for (int k = 0;k < 10; /*k++*/ k += 2){
            System.out.println("for loop, k = " + k);
        }//end for
        // k is now out of scope
//        System.out.println("And now k is " + k);
    }// end main

}// end class Main
