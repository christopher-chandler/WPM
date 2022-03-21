package timeManager;

import java.util.concurrent.TimeUnit;

public class Countdown {

    public static void StartCountdown(int range) throws InterruptedException{

        int i;

        for (i = 1; range > i; i++) {
            String start;
            start = String.format("We will start in %d",i);
            System.out.println(start);
            TimeUnit.SECONDS.sleep(i);
        }

        System.out.println("Go!!!");

    }

}
