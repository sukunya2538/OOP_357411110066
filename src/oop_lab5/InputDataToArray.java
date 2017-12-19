package oop_lab5;

import java.util.Scanner;
//input Data from user
//find summation of data in array
//find average value of data in array
//find maxnimun value of data in array
//find minimun value of data in array

public class InputDataToArray {
    private static final int MAX = 10;

    public static void main(String[] args) {
        int num[]=new int[MAX];
        num = inputData(num);
       showData(num);

    }//main

    private static void showData(int[] num) {
        System.out.print("Data in array: ");
        for (int val: num)
            System.out.print(val+" ");
    }

    private static int[] inputData(int []num) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Plese enter data to array");
        for (int i=0;i<num.length;i++){
            System.out.print("number["+i+"]:");
            num[i]=scanner.nextInt();
        }
        return num;
    }

}//class
