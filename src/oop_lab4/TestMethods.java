package oop_lab4;

public class TestMethods {
 // Methods

   // type 1
    public static void A(){
       System.out.println("Hello A");
       B(20);
    }//A

   // type 2
   public  static void B (int x){
       System.out.println("Hello B "+x);
    }//B

   // type 3
   private static int C (int x , int y){
      System.out.println("Hello C ");
      return x+y;
   }//C


    public static void main(String[] args) {
      System.out.println("Hello Main");

      // calling methods
      //A();
      //B(10);
      int number = C(10, 20);
      System.out.println(number);
      System.out.println(C(50,50));

    }//main
}//class
