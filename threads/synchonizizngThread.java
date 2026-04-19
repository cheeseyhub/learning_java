class SharedData {
    private int count = 0;
    public synchronized void increment() {
        this.count++;
    }
    public int getCount() {
        return count;
    }
}
public class synchonizizngThread {
    public static void main(String[] args) throws InterruptedException{
        
        SharedData data = new SharedData();

        Runnable task = () -> {
            for(int i = 0 ; i < 1000;i++)
            {
                data.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Count : " + data.getCount() );
    }

}