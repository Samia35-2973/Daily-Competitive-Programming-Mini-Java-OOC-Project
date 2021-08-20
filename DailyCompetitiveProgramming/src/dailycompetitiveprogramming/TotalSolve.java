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
public class TotalSolve {
    private int totalSolve;
    TotalSolve(int totalSolve){
        this.totalSolve = totalSolve;
    }
    int readTarget(){
        String targetText="";
        try{
            File f4 = new File("Target.txt");
            Scanner input = new Scanner(f4);
            while(input.hasNext()){
                targetText+=input.nextLine();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not be found");
        }
        return Integer.parseInt(targetText);
    }
    void saveTotalSolveOverAll(){
        String totalSolveText="";
        try{
            File f5 = new File("TotalSolve.txt");
            Scanner input = new Scanner(f5);
            while(input.hasNext()){
                totalSolveText+=input.nextLine();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not be found");
        }
        int totalSolvedProblems = Integer.parseInt(totalSolveText)+totalSolve;
        try{
            File f5 = new File("TotalSolve.txt");
            FileWriter fw5 = new FileWriter(f5);
            fw5.write(String.valueOf(totalSolvedProblems));
            fw5.write("\r\n");
            fw5.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
}
