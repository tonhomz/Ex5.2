/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorebound;

import java.util.Scanner;

/**
 *
 * @author Prueksa
 */
public class ScoreBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
               
        LiveScoreBeans LiveScore = new LiveScoreBeans();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        
        LiveScore.addPropertyChangeListener(sub1);
        LiveScore.addPropertyChangeListener(sub2);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String str = sc.nextLine();
            if(str.equals("")) {
                break;
            }
            LiveScore.setscoreLine(str);
        } 
    }
}
