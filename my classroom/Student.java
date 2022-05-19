/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.classroom;

/**
 *
 * @author GLNN104Lab
 */
public class Student {
    public long studentID;
    public String lastName;
    public String firstName;

    public Student(long studentID, String lastName, String firstName) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "studentID=" 
                + studentID + 
                "\n\t" + lastName 
                + "\t" + firstName ;
    }
    
    
}
