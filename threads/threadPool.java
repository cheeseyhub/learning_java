import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPool {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 1 ; i <=10;i++)
        {
            int taskID = i;
            executor.submit(() -> {
                System.out.println("Task " + taskID + " is being processed");

                try {
                    Thread.sleep(1000);

                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
        System.out.println("Main Thread: All tasks Submitted");
    }
    
}
