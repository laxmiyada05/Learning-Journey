import java.util.*;
import java.util.concurrent.*;
public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int id = i;
            tasks.add(() -> {
                Thread.sleep(1000);
                return "Task " + id + " completed";
            });
        }
        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println(future.get());
        }
        executor.shutdown();
    }
}
