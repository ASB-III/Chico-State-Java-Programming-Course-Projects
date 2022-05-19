/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5f18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.newBufferedReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.classes.Department;

/**
 *
 * @author GLNN104Lab
 */
public class Lab5F18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Department> 11 
        = LinkedList<> ();
        Scanner sc;
        String input;
        SimpleDateFormat sdf
                = new SimpleDateFormat("M/d/y");
        //local variables
        int dID;
        String deptName;
        String startDate;
        Date Start;
        String deptStreet;
        int deptZip;
        String, city, state, country;
        Department dept;

        try (BufferedReader br
                = newBufferedReader(
                        new FileReader("DeptData.txt"));
                BufferedWriter bw
                = new BufferedWriter(
                        new FileWriter("BadRecs.txt"))) {
            while ((input = br.readLine()) 
                    != null) {
                sc = new Scanner(input.trim());
                // sc.useDelimiter(",");
                sc.useDelimiter("\\s*,\\s*");
                try {
                    dID = sc.nextInt();
                    deptName = sc.next();
                    startDate = sc.next();
                    start
                            = sdf.parse(StartDate);
                    deptStreet = sc.next();
                    deptzip = sc.nextInt();
                    city = sc.next();
                    state = sc.next();
                    country = sc.next();
                    dept = new Department(dID,
                            deptName, start,
                            deptStreet,
                            deptZip, city,
                            state, country);
                    11.add(dept);
                            
            }   catch (Exception ex) {
                StackTraceElement[] st=
                ex.getStackTrace();
                System.out.println(
                input + "\t"
                +st[st.length - 1]);
                bw.write(input);
                bw.newLine();
            }
        }
    }   catch (IOException ex) {
            Logger.getLogger(Lab5F18.class.getName()).log(Level.SEVERE, null, ex);
    }// end try catch
    System.out.Println("\n\n"
    + "List of Departments");
    for (Department x: 11) {
    if (x.getDeptCity().equals("Seattle")){
        x.setDeptCity("Redmond");
    }//end if
    System.out.println();
}
}
