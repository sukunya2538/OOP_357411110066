package oop_lab9;

public class myPersonApp {
    public static void main(String[] args) {

            //Address
            Address address = new Address("123","Nakhon si Thammarat",80110);
            //Job
            Job job = new Job("Doctor",30000);
            //person
            Person person = new Person("11","sukunya",address,job);

            System.out.println(person.toString());

           Person person1 = new Person("12","onnida",address,job);

             System.out.println(person1.toString());

           person.getJob().setSalay(35000);
           System.out.println(person.getJob().getSalay());
           System.out.println(person.getAddress().getPostCode());

        }//main
}//class
