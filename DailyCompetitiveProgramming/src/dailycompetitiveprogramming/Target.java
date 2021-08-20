/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycompetitiveprogramming;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Target {
    private int target;
    Target(int target){
        this.target = target;
    }
    void saveTarget(){
        try{
            File f4 = new File("Target.txt");
            FileWriter fw4 = new FileWriter(f4);
            fw4.write(String.valueOf(target));
            fw4.write("\r\n");
            fw4.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
}
