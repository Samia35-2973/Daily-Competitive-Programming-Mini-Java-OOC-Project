/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycompetitiveprogramming;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Calculation {
    private int target, totalDailySolved;
    private String solvedDate;
    Calculation(int target, int totalDailySolved, String solvedDate){
        this.target = target;
        this.totalDailySolved = totalDailySolved;
        this.solvedDate = solvedDate;
    }
    double findAndSaveProgress(){
        double percentage;
        String feedOfTheDay="";
        percentage = (totalDailySolved*100.0)/target;
        if(percentage==0) feedOfTheDay = "You are not dedicated yet. CP world is a world of excitement. There are coders like you rock everyday. Please Start with me";
        else if(percentage>=1 && percentage<=30) feedOfTheDay = "You are about to start competitive programming. Let's Go!";
        else if(percentage>=31 && percentage<=60) feedOfTheDay = "You have to keep up with this streak. You can do it!";
        else if(percentage>=61 && percentage<=99) feedOfTheDay = "Just a little more hardwork will take you to the world of competitive programming";
        else if(percentage>=100) feedOfTheDay = "You just took off towards the competitive programming world. Good luck with your contest. See you again tomorrow";
        JOptionPane.showMessageDialog(null, feedOfTheDay);
        try{
            File f6 = new File("Progress.txt");
            FileWriter fw6 = new FileWriter(f6,true);
            fw6.write("Date: "+solvedDate);
            fw6.write("\r\n");
            fw6.write("Total Solved: "+String.valueOf(totalDailySolved));
            fw6.write("\r\n");
            fw6.write("Target: "+String.valueOf(target));
            fw6.write("\r\n");
            fw6.write("You have achieved "+String.valueOf(percentage)+"% of your goal!");
            fw6.write("\r\n");
            fw6.write("Feedback of the day: "+feedOfTheDay);
            fw6.write("\r\n");
            fw6.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
        if(percentage>=100) return 100.0;
        else return percentage;
    }
}
