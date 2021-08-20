package dailycompetitiveprogramming;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SolvingProgress {
    int readTotalSolve(){
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
        int totalSolvedProblems = Integer.parseInt(totalSolveText);
        return totalSolvedProblems;
    }
    public String readAllProgressHistory(){
        String progressHistory="";
        try{
            File f6 = new File("Progress.txt");
            Scanner input = new Scanner(f6);
            while(input.hasNext()){
                progressHistory+=input.nextLine()+"\n";
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File could not be found");
        }
        return progressHistory;
    }
}
