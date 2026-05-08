package core.basesyntax;

import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    @Override
    public String call() {
        Random randomizer = new Random();
        int worktime = randomizer.nextInt(1000);
        return String.format("Task duration was %d ms, execution finished at %tT:%<tL",
                worktime, LocalTime.now());
    }
}
