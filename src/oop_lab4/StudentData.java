package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
    public static String main(String[] args) {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      public static String getname()throws IOException {
          System.out.print("Enter your name: ");
          return reader.readLine();
    }//getname

   public static String getAdderss()throws IOException {
        System.out.print("Enter your Adderss: ");
        return reader.readLine();
    }//getAdderss

 public static String getStdID()throws IOException {
        System.out.print("Enter your StdID: ");
        return reader.readLine();
    }//getID

    public static String getBranch()throws IOException {
        System.out.print("Enter your Branch: ");
        return reader.readLine();
    }//getBranch

   public static String getmajor()throws IOException {
        System.out.print("Enter your major: ");
        return reader.readLine();
    }//getmajor

    public static String getemail()throws IOException {
        System.out.print("Enter your email: ");
        return reader.readLine();
    }//getemail

    public static void main(String[] args) throws IOException{
        String name =getname();
        String address =getAdderss();
        String StdID =getStdID();
        String Branch =getBranch();
        String major =getmajor();
        String email =getemail();
        System.out.println(name+"\n"+address+"\n"+StdID+"\n"+Branch+"\n"major+"\n"+email+"\n");
        System.out.println(getname()+"\n"+getAdderss());
    }

      }//main
}//class
