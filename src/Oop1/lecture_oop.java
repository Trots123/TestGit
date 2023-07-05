package Oop1;


public class lecture_oop {


    public static void main (String[] args){


        Student Student1 = new Student("Artem", 18, "Kovtun");


        System.out.println(Student1.getName());
        System.out.println(Student1.getAge());
        System.out.println(Student1.getSurname());





            Teacher Teacher1 = new Teacher("Sasha", 34, "Trots", "Artem Kovtun");

Teacher1.setName ("Mukuta");
Teacher1.setAge(19);
       System.out.println(Teacher1.getName());
        System.out.println(Teacher1.getAge());
        System.out.println(Teacher1.getSurname());
      System.out.println(Teacher1.getStudent());


    }
}


