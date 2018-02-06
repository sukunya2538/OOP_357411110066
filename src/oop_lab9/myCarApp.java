package oop_lab9;

public class myCarApp {
    public static void main(String[] args) {
        //Enging
       Engine engine = new Engine("1500 CC","V-TEC V4");

       //Car
        Car car = new Car("Honda","Black",engine);

        System.out.println(car.toString());

        Car car1 = new Car("Honda","Red",engine);

        System.out.println(car1.toString());








    }//main
}//class
