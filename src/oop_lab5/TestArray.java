package oop_lab5;

public class TestArray {
    public static void main(String[] args) {
        int []number;
        number = new int[5];
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        number[3] = 100;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
    }
}
