import java.util.Random;
import java.util.Arrays;
public class Test1 {
    public static void main(String[] args) {

       /*   1:Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
            2:Вивести його на консоль
            3:Знайти мінімальне значення
            4:Знайти максимальне значення
            5:Знайти середнє значення
            6:Знайти суму всіх елементів
        */
        final Random random = new Random();

        System.out.println("1,2 Завдання");

        int[][] test1 = new int[2][5];
        for (int i = 0; i < test1.length; i++) {
            for (int j = 0; j < test1[i].length; j++) {
                test1[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(test1));

        System.out.println("3 Завдання");

        int min = test1[0][0];

        for (int a = 1; a < test1.length; a++) {
            for (int b = 1; b < test1[a].length; b++) {
                if (test1[a][b] < min) {
                    min = test1[a][b];
                }
            }
            System.out.println(min);

            System.out.println("4 Завдання");

            int max = test1[0][0];

            for (int c = 1; c < test1.length; c++) {
                for (int d = 1; d < test1[c].length; d++) {
                    if (test1[c][d] > max) {
                        max = test1[c][d];
                    }
                }
                System.out.println(max);
            }
        }
        System.out.println("5 Завдання");
        double average = 0;
        if (test1.length > 0) {
            double sum = 0;
            for (int c = 0; c < test1.length; c++) {
                for (int d = 0; d < test1[c].length; d++) {
                    sum += test1[c][d];
                }
                average = sum / test1.length;
                System.out.println(average);
            }


            System.out.println("6 Завдання");
            if (test1.length > 0) {
                double sum1 = 0;
                for (int i = 0; i < test1.length; i++) {
                    for (int j = 0; j < test1[i].length; j++) {
                        sum1 += test1[i][j];
                    }
                }
                System.out.println(sum1);

            }


        }
    }
}




