package oop_lab4;
//1.OverLoad Method
//2.OverLoading Method
//3.Method OverLoading/OverLoad

public class OverLoadMethod {
    private static void A(){
        System.out.println("Hello A1");
    }
    private static void A(int x){
        System.out.println("Hello  "+x);
    }
    private static void A(int x,int y){
        System.out.println("Hello "+(x+y));
    }

    public static void main(String[] args) {
      A();
      A(10,20);

    }//main


}//class
