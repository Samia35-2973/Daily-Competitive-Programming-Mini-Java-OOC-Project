/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycompetitiveprogramming;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PendingProblem {
    private String problem;
    PendingProblem(String problem){
        this.problem = problem;
    }
    void addProblemList(){
        try{
            File f8 = new File("ProblemList.txt");
            FileWriter fw8 = new FileWriter(f8,true);
            fw8.write(problem+" ");
            fw8.write(" ");
            fw8.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not open");
        }
    }
    String viewProblemList(){
        String ProblemList="";
        try{
            File f8 = new File("ProblemList.txt");
            Scanner input = new Scanner(f8);
            while(input.hasNext()){
                ProblemList+=(input.nextLine()+" ");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not found");
        }
        return ProblemList;
    }
    void editProblemList(){
        try{
            File f8 = new File("ProblemList.txt");
            FileWriter fw8 = new FileWriter(f8);
            fw8.write(problem);
            fw8.write(" ");
            fw8.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not open");
        }
    }
}
