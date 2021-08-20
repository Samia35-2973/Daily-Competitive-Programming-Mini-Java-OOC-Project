package dailycompetitiveprogramming;


import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Feedback {
    private String feedBacks, userName;
    Feedback(String feedBacks, String userName){
        this.userName = userName;
        this.feedBacks = feedBacks;
    }
    void saveFeedbacks(){
        try{
            File f2 = new File("Feedback.txt");
            FileWriter fw2 = new FileWriter(f2,true);
            fw2.write("Name: ");
            fw2.write(userName);
            fw2.write("\r\n");
            fw2.write("Feedback: ");
            fw2.write(feedBacks);
            fw2.write("\r\n");
            fw2.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
}
