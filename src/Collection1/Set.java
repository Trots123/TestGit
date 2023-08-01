package Collection1;
import java.util.*;
public class Set {
//1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном від 1 до 50 за зберегти їх у різні типи колекцій сет
//2. Вивести всі 3 варіанти на консоль



    public static void main(String[] args){
        Random random = new Random();
        HashSet<Integer> Numbers1 = new HashSet<>();
        LinkedHashSet<Integer> Numbers2 = new LinkedHashSet<>();
        TreeSet<Integer> Numbers3 = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
        int number = random.nextInt(50);
        if (number % 2 == 0) {
            Numbers1.add(number);
        } else {
            Numbers3.add(number);
        }
        Numbers2.add(number);
    }
        System.out.println(" парних чисел" + Numbers1);
        System.out.println(" непарних чисел" + Numbers3);
        System.out.println(" унікальних чисел" + Numbers2);

}

}
