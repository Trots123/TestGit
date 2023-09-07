package Dz29;

public class dz29 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for(int i=0; i<=10; i++){
                System.out.println("Thread #1. First thread iteration #" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int j=0; j<=10; j++){
                System.out.println("Thread #2. Second thread iteration #" + j);
            }
        });


        runThreads(thread1, thread2);

    }

    private static void runThreads(Thread ... threads) {
        for(Thread thread : threads) {
            thread.start();
        }
    }

}
