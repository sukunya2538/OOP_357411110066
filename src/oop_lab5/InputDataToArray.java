package oop_lab5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//input Data from user
//find summation of data in array
//find average value of data in array
//find maxnimun value of data in array
//find minimun value of data in array
//Sorting data with Descending Order
//Sorting data with Ascenging Order

public class InputDataToArray {
    private static final int MAX = 10;

    public static void main(String[] args) {
        Integer num[]=new Integer[MAX];
        num = inputData(num);
       showData(num);
       summation(num);
       findMax(num);
       findMin(num);
    }//main

    private static void findMin(Integer[] num) {
        System.out.println("The minimum value is:  "+(Collections.min(Arrays.asList(num))));
    }//findMin

    private static void findMax(Integer[] num) {
        System.out.println("The maximum value is:  "+(Collections.max(Arrays.asList(num))));
    }//findMax



    private static Integer[] inputData(Integer[] num) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Plese enter data to array");
        for (int i=0;i<num.length;i++){
            System.out.print("number["+i+"]:");
            num[i]=scanner.nextInt();
        }
        return num;

    }

    private static void summation(Integer[] num) {
        Integer total = 0;
        for (int i=0;i<num.length;i++){
            total += num[i];
        }
            System.out.println("\n The summation of value in array is: "+total);
        System.out.println("The average value "+"in array is: "+total/MAX);
    }

    private static void showData(Integer[] num) {
        System.out.print("Data in array: ");
        for (int val: num){
            System.out.print(val+" ");
    }


    }//main

}//class
