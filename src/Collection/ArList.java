package Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class ArList<T> {


    public static void main(String[] args){

        ArrayList<Integer> stud1 = new ArrayList<>();

        for (int i=0; i<=10; i++) {
            stud1.add(i);
        }
        System.out.println(stud1);


        ArrayList<Integer> stud2 = new ArrayList<>(2000000);
        for (int a=0; a<=2000000; a++){
            stud2.add(a);
        }
        System.out.println(stud2);


        ArrayList<Student> stud3 = new ArrayList<>();

        Student student1 = new Student("Nikita");
        Student student2 = new Student("Artem");
        Student student3 = new Student("Olerg");
        Student student4 = new Student("Sasha");
        Student student5 = new Student("Vika");
        Student student6 = new Student("Nika");
        Student student7 = new Student("Sveta");
        Student student8 = new Student("Dima");
        Student student9 = new Student("Stas");
        Student student10 = new Student("Taras");

        stud3.add(student1);
        stud3.add(student2);
        stud3.add(student3);
        stud3.add(student4);
        stud3.add(student5);
        stud3.add(student6);
        stud3.add(student7);
        stud3.add(student9);
        stud3.add(student10);

        System.out.println(stud3);




    }
}
