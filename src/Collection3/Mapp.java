package Collection3;



import Collection3.Words;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Mapp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String wor =scanner.next();
      Map<Words, String> map = new HashMap<>();


        Words words1 = new Words("Яблоко");
        Words words2 = new Words("Молоко");
        Words words3 = new Words("Сонце");
        Words words4 = new Words("Дерево");
        Words words5 = new Words("Лі");
        Words words6 = new Words("пусь ");
        Words words7 = new Words("пусь ");
        Words words8 = new Words("пусь ");
        Words words9 = new Words("пусь ");
        Words words10 = new Words("пусь ");


        map.put(words1,"Apple,Ukr,Ukr");
        map.put(words2,"Ukr,Ukr,Ukr");
        map.put(words3,"Ukr,Ukr,Ukr");
        map.put(words4,"Ukr,Ukr,Ukr");
        map.put(words5,"Ukr,Ukr,Ukr");
        map.put(words6,"Ukr,Ukr,Ukr");
        map.put(words7,"Ukr,Ukr,Ukr");
        map.put(words8,"Ukr,Ukr,Ukr");
        map.put(words9,"Ukr,Ukr,Ukr");
        map.put(words10,"Ukr,Ukr,Ukr");

        System.out.println(scanner);

    }

}
