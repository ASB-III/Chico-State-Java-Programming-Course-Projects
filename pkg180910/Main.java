/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180910;

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
        int x = 5;
        String level;
        int score;
        
        x *= 7 + 3;
        System.out.println(x);
        x /= 7 + 3;
        
        level = "Tin";
        switch (level) {
            case "Platinum":
                System.out.println("8% Cash Back");
                //No break
            case "Gold":
                System.out.println("Double points "
                        + "at Amazon");
                // No break
            case "Silver":
                System.out.println("Plastic "
                        + "Fly Swatter");
                // No break
            case "Lead":
                System.out.println("Our hearty "
                        + "Thanx");
                break;
            default:
                System.out.println("Cheap skate");
            
        } // end switch
        score = 95;
        switch (score){
            case 100:
            case 99:
            case 98:
            case 97:
            case 96:
            case 95:
            case 94:
                System.out.println("A");
                break;
            default:
                System.out.println("Not so good");
               
        }// end score switch
        if (score >= 90){
            System.out.println("A");
            
        }else if (score >= 80){
            System.out.println("B");
        }else if (score >= 70){
            System.out.println("C");
        }else if (score >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }// end score if else
                
        System.out.println("x is now " + x);
    }
    
}
