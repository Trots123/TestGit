import java.lang.invoke.TypeDescriptor;

public class IfElse {

    public static void main(String[] args) {
     /*
     Створити 3 програми:

програму для знаходження більшого з двох чисел

програму для знаходження меншого з двох чисел

програму для перевірка заданого числа на парність
      */
         int a = 8;
         int b = 6;

        System.out.println("Первое задание ");
         if (a>b){
             System.out.println("A больше B");
         }else {
             System.out.println("B больше A");
         }

       System.out.println("Второе задание ");

        if (a<b){
            System.out.println("A больше B");
        }else {
            System.out.println("B больше A");
        }

        System.out.println("Третие задание");

        if (a % 2==1){
            System.out.println("не парное");
        }else {
            System.out.println("парное");
        }
    }
}