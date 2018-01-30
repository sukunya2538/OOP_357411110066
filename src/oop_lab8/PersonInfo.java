package oop_lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student("1809700249043",
                " sukunya",
                "Gril",
                23,
                "357411110066",
                "IS :Management Technoloay");
          System.out.println(student.toString());
          System.out.println(student.getName());

          Employee employee = new Employee("1809700249043",
                  "sam","Gril"
                  ,23,
                  "1234",
                  "PC",
                  "25000");
        System.out.println(employee.toString());
        System.out.println(employee.getName());







    }//main
}//class
