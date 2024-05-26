package Lab4.APP4;

import Lab4.EX1.ExecutionThread;

public class App4 {
    public static void main(String[] args) throws InterruptedException {

        ExecutionThread4 thread4 = new ExecutionThread4(2, 3, 7, 7);
        ExecutionThread5 thread51 = new ExecutionThread5(3, 5, thread4);
        ExecutionThread5 thread52 = new ExecutionThread5(4, 6, thread4);

        thread4.start();
        thread51.start();
        thread52.start();

        thread4.join();
        thread51.join();
        thread52.join();
    }
}
