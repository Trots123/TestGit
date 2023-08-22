package Dz24;

import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.Scanner;
//

public class Main {
    public static void main(String[] args) {

    /*
    1.
    - Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.
    - При вводі замість числа  букв - показувати повідомлення про помилку на консоль.
    - За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок
    */

       // public static void enterNumber () {

            Scanner entering = new Scanner(System.in);

            while (true) {
                try {
                    System.out.println("Введіть числове значення");
                    int enter = entering.nextInt();
                    System.out.println("Введене значення: " + enter);
                    break;
                } catch (NoSuchElementException e) {
                    System.out.println("Ви ввели Букву");
                    entering.nextLine();

                }
            }
            entering.close();
        }



    /*
    2.
    Створити виняток який викидається коли число менше нуля. Створити функцію, яка приймає число і повертає його квадрат.
 Якщо число буде менше нуля - то викинути створений вийняток
 */
    public static int pow() {

        Scanner powering = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введіть число для зведення у другу ступінь");
                int num = powering.nextInt();
                if (num <= 0) {
                    throw new PowException("Введіть число більше за нуль");
                }
                System.out.println(num + " зведене у ступінь 2 дорівнює: ");
                return num * num;
            } catch (PowException e) {
                System.out.println(e.getMessage());
                powering.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ви ввели не число, повторіть спробу, будь-ласка");
                powering.nextLine();
            }
        }
    }
}


