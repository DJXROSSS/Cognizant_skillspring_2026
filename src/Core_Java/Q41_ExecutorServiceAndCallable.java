package Core_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q41_ExecutorServiceAndCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            List<Callable<String>> tasks = new ArrayList<>();
            tasks.add(() -> "Task 1 result");
            tasks.add(() -> "Task 2 result");
            tasks.add(() -> "Task 3 result");

            List<Future<String>> results = executorService.invokeAll(tasks);
            for (Future<String> result : results) {
                System.out.println(result.get());
            }
        } finally {
            executorService.shutdown();
        }
    }
}
