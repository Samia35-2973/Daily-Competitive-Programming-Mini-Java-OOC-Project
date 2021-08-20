package dailycompetitiveprogramming;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Solver extends User{
    private String solverName;
    private String solverPassword;
    Solver(String solverName, String solverPassword){
        super(solverName, solverPassword);
    }
    void resetTarget(){
        try{
            File f4 = new File("Target.txt");
            FileWriter fw4 = new FileWriter(f4);
            fw4.write("0");
            fw4.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
    void resetProgress(){
        try{
            File f6 = new File("Progress.txt");
            FileWriter fw6 = new FileWriter(f6);
            fw6.write("");
            fw6.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
    void resetTotalSolve(){
        try{
            File f5 = new File("TotalSolve.txt");
            FileWriter fw5 = new FileWriter(f5);
            fw5.write("0");
            fw5.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not be found");
        }
    }
    void resetLearnerProgress(){
        try{
            File f7 = new File("Study.txt");
            FileWriter fw7 = new FileWriter(f7);
            fw7.write("");
            fw7.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
    void resetPendingProblemList(){
        try{
            File f8 = new File("ProblemList.txt");
            FileWriter fw8 = new FileWriter(f8);
            fw8.write("");
            fw8.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
}
