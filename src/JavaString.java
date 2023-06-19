public class JavaString {
    public static void main(String[] args) {
 /*
        String Test = "RoboT" ;
        System.out.println(Tekst.length()) ;

         */
        /*


       String Test = "RoboT" ;
        System.out.println(Test.concat(".").concat("DreamS")) ;
        String Test2 = "Java" ;
        System.out.println(Test + Test2);

         */


        /*

        String Test = "RoboT.DreamS" ;
        System.out.println(Test.toLowerCase());
        System.out.println(Test.toUpperCase());


         */
        /*
        String Test = "RoboT.DreomS" ;
        System.out.println(Test.replace("o" ,"G"));
RoboT.DreamS"
         */


        //  String Test = "Test" ;
        //   System.out.println(Test.substring(0,1));




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