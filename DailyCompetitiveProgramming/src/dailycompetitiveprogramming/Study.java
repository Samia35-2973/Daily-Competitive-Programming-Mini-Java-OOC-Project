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
public class Study {
    private String topic;
    Study(String topic){
        this.topic = topic;
    }
    void saveTopic(){
        try{
            File f7 = new File("Study.txt");
            FileWriter fw7 = new FileWriter(f7,true);
            fw7.write("Topic: "+topic);
            fw7.write("\r\n");
            fw7.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
    String readTopic(){
        String topicHistory="";
        try{
            File f7 = new File("Study.txt");
            Scanner input = new Scanner(f7);
            while(input.hasNext()){
                topicHistory+=input.nextLine()+"\n";
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
        return topicHistory;
    }
}
