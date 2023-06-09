public class JavaString {
    public static void main(String[] args) {

/*
Створити програму для обробки символьних рядків:

Створити зміну типу String

Показати цю зміну у верхньому та нижньому регістрах

Показати першу та останню літери
 */




        String Test = "RoboT.DreamS" ;


        System.out.println ("Нижній Регістр " + Test.toLowerCase());
        System.out.println ("Верхній Регістр " + Test.toUpperCase());




        System.out.println("Перша літера " + Test.substring(0,1));


        System.out.println("Остання літера " + Test.substring(11,12));


    }
}