package Lab4.APP2;

import Lab4.EX1.ExecutionThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        Integer firstMonitor = new Integer(1);
        Integer secondMonitor = new Integer(2);

        new ExecutionThread2(firstMonitor, secondMonitor, new int[]{2, 4}, new int[]{4, 6}, new int[]{4}, new int[]{4}).start();
        new ExecutionThread2(secondMonitor, firstMonitor, new int[]{3, 5}, new int[]{5, 7}, new int[]{5}, new int[]{5}).start();
    }
}
