package advancedconcept;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threads {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*Thread thread = new Thread(new CustomThread());
        thread.start();*/

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Executing long task...");
            Thread.sleep(3000);
            return 42;
        });

        System.out.println("Doing other stuff...");
        int result = future.get();
        System.out.println("Task terminated with result: " + result);

        executorService.shutdown();
    }
}
