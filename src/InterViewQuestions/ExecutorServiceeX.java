package InterViewQuestions;

import java.util.concurrent.*;

public class ExecutorServiceeX {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        Callable<String> task =()->
        {
            Thread.sleep(2000);
            return "Hello";
        };

        Future<String> future=executorService.submit(task);


        if(!future.isDone())
        {
            System.out.println("Task is still running");
        }


        String result= future.get(); // blocking retrieval


        System.out.println("Task result: "+result);

        System.out.println("Is canceleld? " +future.isCancelled());

        executorService.shutdown();

    }
}
