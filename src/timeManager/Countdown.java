package timeManager;

import java.util.concurrent.TimeUnit;

public class Countdown {

    public void StartCountdown(int range, String name) throws InterruptedException{

        int i;

        for (i = 1; range > i; i++) {
            String start;
            start = String.format("We will start in %d", i);
            System.out.println(start);
            TimeUnit.SECONDS.sleep(i);
        }
        String cheerPlayer = String.format("Go %s !!", name);
        System.out.println(cheerPlayer);

    }

}
