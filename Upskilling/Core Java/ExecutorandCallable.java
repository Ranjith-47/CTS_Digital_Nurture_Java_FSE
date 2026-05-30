import java.util.concurrent.*;

public class ExecutorandCallable {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<Integer> t1 = () -> {
            Thread.sleep(1000);
            return 10 + 20;
        };
        Callable<Integer> t2 = () -> {
            Thread.sleep(1000);
            return 30 + 40;
        };
        Callable<Integer> t3 = () -> {
            Thread.sleep(1000);
            return 50 + 60;
        };
        try {
            Future<Integer> result1 = executor.submit(t1);
            Future<Integer> result2 = executor.submit(t2);
            Future<Integer> result3 = executor.submit(t3);
            System.out.println("Result 1: " + result1.get());
            System.out.println("Result 2: " + result2.get());
            System.out.println("Result 3: " + result3.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}