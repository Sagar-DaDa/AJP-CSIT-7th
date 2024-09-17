public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        CustomThread t1 = new CustomThread("Thread 1");
        CustomThread t2 = new CustomThread("Thread 2");
        CustomThread t3 = new CustomThread("Thread 3");

        t3.setPriority(10);

        t1.start();  // Start thread 1
        t2.start();  // Start thread 2
        t3.start();  // Start thread 3

        t1.join();  // Wait for thread 1 to finish
        t2.join();  // Wait for thread 2 to finish
        t3.join();  // Wait for thread 3 to finish

        System.out.println("Main thread exiting");
    }
}