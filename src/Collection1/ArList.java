package Collection1;
import java.util.ArrayList;

public class ArList<T> {

/*
1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип

2. Зберегти у колекції список студентів (класс Студент теж створити)

3. Вивести цей список

4. Опціонально: написати реалізацію класу ArrayList або LinkedList
 */
    public static void main(String[] args){
        System.out.println("1.1 Пункт");
        ArrayList<Integer> stud1 = new ArrayList<>();

        for (int i=1; i<10; i++) {
            stud1.add(i);
        }
        System.out.println(stud1);

        System.out.println("1.2 Пункт");
        ArrayList<Integer> stud2 = new ArrayList<>();
        for (int a=1; a<2000000; a++){
            stud2.add(a);
        }
        System.out.println(stud2);

        System.out.println("2 Пункт");
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
