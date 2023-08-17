package Collection3;



import Collection3.Words;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Mapp {


    private static Object Words;

    public static void main(String[] args) {


        Map<Words, String> map = new HashMap<>();


        Words words1 = new Words("Яблуко");
        Words words2 = new Words("Молоко");
        Words words3 = new Words("Сонце");
        Words words4 = new Words("Дерево");
        Words words5 = new Words("Ліхтярь");
        Words words6 = new Words("Стіл");
        Words words7 = new Words("Дім");
        Words words8 = new Words("Дим");
        Words words9 = new Words("Слова");
        Words words10 = new Words("Книга");


        map.put(words1, "Англійська<<Apple>>,Японська<<リンゴr>>,Німецька<<Apfel>>");
        map.put(words2, "Англійська<<Milk>>,Японська<<ミルク>>,Німецька<<Milch>>");
        map.put(words3, "Англійська<<Sun>>,Японська<<太陽>>,Німецька<<Sonne>>");
        map.put(words4, "Англійська<<Tree>>,Японська<<木>>,Німецька<<Baum>>");
        map.put(words5, "Англійська<<Flashlight>>,Японська<<ランタン>>,Німецька<<Laterne>>");
        map.put(words6, "Англійська<<Table>>,Японська<<テーブル>>,Німецька<<Tisch>>");
        map.put(words7, "Англійська<<House>>,Японська<<家>>, Німецька<<Haus>>");
        map.put(words8, "Англійська<<Smoke>>,Японська<<煙>>,Німецька<<Rauch>>");
        map.put(words9, "Англійська<<World>>,Японська<<言葉>>,Німецька<<Worte>>");
        map.put(words10, "Англійська<<Book>>,Японська<<本>>,Німецька<<Buch>>");



            System.out.println();

        }

    }

