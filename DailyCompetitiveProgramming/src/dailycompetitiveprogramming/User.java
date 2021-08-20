package dailycompetitiveprogramming;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class User {
    private String userName;
    private String password;
    User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    void saveUserName(){
        try{
            File f = new File("Username.txt");
            FileWriter fw = new FileWriter(f,true);
            fw.write(userName);
            fw.write("\r\n");
            fw.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
    void registration(){
        try{
            File f3 = new File("SolversInformation.txt");
            FileWriter fw3 = new FileWriter(f3);
            fw3.write(userName);
            fw3.write("\r\n");
            fw3.write(password);
            fw3.write("\r\n");
            fw3.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registration Failed! Try Again!");
        }
    }
    boolean logIn(){
        String informationOfSolver = "";
        try{
            File f3 = new File("SolversInformation.txt");
            Scanner input = new Scanner(f3);
            while(input.hasNext()){
                informationOfSolver+=input.nextLine()+" ";
            }
            System.out.println(informationOfSolver);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Login Failed! Try Again!");
        }
        int flag =0;
        for (String information: informationOfSolver.split(" ")){
            if(userName.equals(information) && flag==0){
                flag = 1;
            }
            if(password.equals(information) && flag==1){
                JOptionPane.showMessageDialog(null, "Login Successful!");
                flag = 2;
                break;
            }
        }
        if(flag==2) return true;
        else return false;
    }
}
