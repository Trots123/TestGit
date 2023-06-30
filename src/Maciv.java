import java.util.Random;
import java.util.Arrays;

public class Maciv {

   // private final static int range = 100;
    //private final static Random random = new Random();

  /*  public static void main(String[] args) {
int [][]name = new int [2][2];
        name [0][0]=2;
        name [0][1]=3;
        name [1][0]=5;
        name [1][1]=5;




        System.out.println(name);


   */

    public static void main(String[] args) {

        int[][] matrix1 = new int[2][2];
        matrix1[0][0] = 5;
        matrix1[1][0] = 1;
        matrix1[0][1] = 4;
        matrix1[1][1] = 0;

       // for(int[] a : matrix1){
            System.out.println(Arrays.deepToString(matrix1));

        System.out.println("Start");
        int[][] test1 = new int[2][5];
        for (int i = 0; i < test1.length; i++) {
            for (int j = 0; j < test1[i].length; j++) {
                //Random random;
               // test1[i][j] = random.nextInt(5);
            }
                System.out.println(Arrays.deepToString(test1));
                System.out.println("Stop");
            }
        }

    }




