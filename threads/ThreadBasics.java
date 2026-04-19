public class ThreadBasics {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            // Added 'public' and 'void' here
            public void run() { 
                try {
                    System.out.println("Background Thread: Starting a heavy Sort...");
                    Thread.sleep(2000);
                    System.out.println("Background Thread: Sort Complete!");
                } catch(InterruptedException e) {
                    System.out.println("Thread was Interrupted");
                }
            }
        });

        myThread.start();

        System.out.println("Main Thread: I am waiting for the background Thread to finish;");

        try {
            myThread.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread: Everything is done, moving on !");
    }
}
