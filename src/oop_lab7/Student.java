package oop_lab7;
//Talking about Student?
//1.student ID
//2.Major
//3.Faculty
//4.Name


public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }//toString

    private String id;
    private String major;
    private String faculty;
    private String name;
    //Constructor
    //Default Constructor
    public Student(){}
    //create Constructor by owner
    public Student(String id,String m,String f,String n ){
    //assign data to class properties
        this.id=id;
        this.major=m;
        this.faculty=f;
        this.name=n;

    }
    //getter and setter methods


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }//getName

    public void setName(String name) {
        this.name = name;
    }//setname
}//class
