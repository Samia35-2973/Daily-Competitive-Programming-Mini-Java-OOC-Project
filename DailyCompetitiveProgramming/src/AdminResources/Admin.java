/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminResources;

import dailycompetitiveprogramming.SolvingProgress;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Admin extends SolvingProgress{
    void checked(){
        JOptionPane.showMessageDialog(null, "Checked");
    }
    String readFeedbacks(){
        String feeds="";
        try{
            File f2 = new File("Feedback.txt");
            Scanner input = new Scanner(f2);
            while(input.hasNext()){
                feeds+=input.nextLine()+"\n";
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not be found");
        }
        return feeds;
    }
    String readUserList(){
        String userList="";
        try{
            File f = new File("Username.txt");
            Scanner input = new Scanner(f);
            while(input.hasNext()){
                userList+=input.nextLine()+"\n";
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not be found");
        }
        return userList;
    }
}
