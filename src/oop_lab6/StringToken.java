package oop_lab6;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String msg = "Hello, RMUTSV Onnida Sawatdee ";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            StringBuffer myBuf = new StringBuffer(
                    myToken.nextToken());
            System.out.println(myBuf.reverse()+" ");
        }


    }//main
}//class