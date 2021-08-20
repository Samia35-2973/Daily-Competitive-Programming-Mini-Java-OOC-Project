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
public class Learner extends User{
    private String learnerName, language;
    private String learnerPassword;
    Learner(String learnerName, String learnerPassword, String language){
        super(learnerName, learnerPassword);
        this.language = language;
    }
    void saveLanguage(){
        try{
            File f7 = new File("Study.txt");
            FileWriter fw7 = new FileWriter(f7,true);
            fw7.write("Language: "+language);
            fw7.write("\r\n");
            fw7.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
}
