/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181205;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
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

        LinkedList<Folks> ll = new LinkedList<>();
        ArrayList<Folks> al
                = new ArrayList<>();
        HashMap<Integer, Folks> hm
                = new HashMap<>();
        int inKey = 0;

        try {
            bfr = new BufferedReader(
                    new FileReader("Folks.csv"));
            bfw = new BufferedWriter(
                    new FileWriter("Errors.out"));
            while ((input = bfr.readLine())
                    != null) {
                //get rid of leading and trailing spaces
                //  on your input
                sc = new Scanner(input.trim());
                //ignore spaces around the delimiter
                sc.useDelimiter("\\s*,\\s*");

                try {
                    //parse our input
                    inName = sc.next();
                    inAge = sc.nextInt();
                    inSalary = sc.nextInt();
                    inIQ = sc.nextInt();
                    //create object
                    mySimpson = new Folks(inName,
                            inAge, inSalary, inIQ);
                    // add to structure
                    ll.add(mySimpson);
                    al.add(mySimpson);
                    hm.put(inKey, mySimpson);
                    inKey++;

                } catch (Exception ex) {
                    //if anything goes wrong with parsing
                    //  we just write the bad record to a file
                    bfw.write(input);
                    bfw.newLine();
                }//end parse
            }//end read
            bfw.close();
            bfr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find file");
            System.exit(-10);
        } catch (IOException ex) {
            System.out.println("Problem with I/O\n\t"
                    + "Contact your admin");
            System.exit(-15);
        }//end read file data parse and add to structure
        /*
         *           Traversal Options
         */
        // Iterator
        Iterator<Folks> it = al.iterator();
        System.out.println("Array List");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\nLinked List");
        it = ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // get keySet and make an iterator of that
        System.out.println("\nHash Map");
        Set <Integer> ks = hm.keySet();
        Iterator<Integer> kit = ks.iterator();
        while (kit.hasNext()){
            mySimpson = hm.get(kit.next());
            System.out.println(mySimpson);
        }
        //object for loop since Java 5
        System.out.println("\nObject For Loop");
        for (Folks x: al){
            System.out.println(x);
        }
        //Java 8 and beyond: lambdas
        System.out.println("\nLambda");
        ll.forEach(x -> System.out.println(x));
        System.out.println("\nHash Map Lambda");
        hm.forEach((k,v) -> System.out.println(
            "Key: " + k + "  Value: " + v));
    }//end method main

}//end class Main
