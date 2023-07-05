package Oop1;

public class Teacher {
    private String student ;
    private String name ;
    private String surname ;
    private int age1  ;

    public Teacher(String name, int age1 , String surname , String student) {
        this.age1=age1 ;
        this.student=student ;
        this.name=name ;
        this.surname=surname ;
    }

   public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age1;
    }

    public void setAge(int age1) {
        this.age1 = age1;
    }

    public String getName() {
        return name;
        }
    public String getStudent() {
       return student;
    }

    public void setStudent(String student) {
        this.student = student ;
    }

    public void setName(String name) {
        this.name = name;

    }


}
