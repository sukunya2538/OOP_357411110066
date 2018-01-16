package Age;

import java.io.IOException;
import java.util.Scanner;

public class CalSalay {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        String id = getID();
        String name = getName();
        String salay = getSalay();
        String overTime = getOverTime();

        System.out.println(id+"\n"+name+"\n"+salay+"\n"+overTime);
        System.out.println(getID()+"\n"+getName()+"\n"+getSalay()+"\n"+getOverTime());

    }//getID
    public static String getID()throws IOException {
        System.out.print("Enter your id: ");
        return scanner.nextLine();
    }//getName
    public static String getName()throws IOException{
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }//getSalay
    public static String getSalay()throws IOException{
        System.out.print("Enter your  and salay: ");
        return scanner.nextLine();
    }//getOverTime
    public static String getOverTime()throws IOException{
        System.out.print("Enter your overTime: ");
        return scanner.nextLine();
    }//main
}//class
