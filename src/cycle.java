public class cycle {
    public static void main(String[] args) {
/*
1:Створити програму для виведення чисел від 1 до 10

2:Показати всі парні числа в діапазоні від 1 до 100

3:Знайти факторіал числа 7

4:Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
 */
        System.out.println("1: завдання");
        for (int i = 0; i <= 10; i++)
            System.out.println(i);


        System.out.println("2: завдання");
        for (int a = 1; a <= 100; a++)
            if (a % 2 == 0)
                System.out.println(a);

        System.out.println("3: завдання");
        int f1=1;

        for (int f2 =1 ; f2<=7; f2++){
            System.out.println(f1*=f2);

        }
        System.out.println("4: завдання ");
          int n1=0;
          int n2=1;
          int n3=0;
           while (n3<100){
           System.out.println(n3);
           n3=n1 +n2 ;
           n1=n2;
           n2=n3;



         /*int b=3;

        System.out.println("2 завдання");
        for (int i=0; i<=10; i++ )

            System.out.println("3*" +  i + "=" + (b*i));
          */






        }
    }
}





