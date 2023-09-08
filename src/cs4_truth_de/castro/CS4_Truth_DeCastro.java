/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_truth_de.castro;

/**
 *
 * @author TRUTH
 */
public class CS4_Truth_DeCastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nilou = "Nilou";
        int days_using_nilou = 302;
        double nilou_level = 90;
        
        String keqing = "Keqing";
        int days_using_keqing = 54;
        double keqing_level = 90;
        
        String ayaka = "Ayaka";
        int days_using_ayaka = 46;
        double ayaka_level = 70;
   
        System.out.println("Name: " + nilou);
        System.out.println("Amount of days playing using Nilou: " + days_using_nilou);
        System.out.println("Current level: " + nilou_level);
        
        System.out.println(""); 
        
        System.out.println("Name: " + keqing);
        System.out.println("Amount of days playing using Keqing: " + days_using_keqing);
        System.out.println("Current level: " + keqing_level);
        
        System.out.println(""); 
        
        System.out.println("Name: " + ayaka);
        System.out.println("Amount of days playing using Ayaka: " + days_using_ayaka);
        System.out.println("Current level: " + ayaka_level);
        
        System.out.println(""); 
        
        int totalDays = days_using_ayaka + days_using_keqing + days_using_nilou;
        int diffNilouKeqing = days_using_nilou - days_using_keqing;
        int diffKeqingAyaka = days_using_keqing - days_using_ayaka;
        int diffAyakaNilou = days_using_nilou - days_using_ayaka;
        double totalLevel = nilou_level + keqing_level + ayaka_level;
        double averageLevel = totalLevel / 3;
        
        System.out.println("Days played using said characters in total: " + totalDays);
        System.out.println("Difference between days of playing using Nilou and Keqing: " + diffNilouKeqing);
        System.out.println("Difference between days of playing using keqing and Ayaka: " + diffKeqingAyaka);
        System.out.println("Difference between days of playing using Ayaka and Nilou: " + diffAyakaNilou);
        System.out.println("Average level of said characters: " + averageLevel);
       }
    }
