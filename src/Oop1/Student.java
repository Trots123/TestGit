
package Oop1;
import java.util.Objects;
public class Student {






    private String name ;
    private String surname ;
    private int age  ;

    public Student(String name, int age , String surname) {
        this.age=age ;
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
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

