package chapter01.c01start;

import java.util.concurrent.Callable;

public class StartCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread.currentThread().sleep(1000);
        }
        return "string" + 1;
    }
}
