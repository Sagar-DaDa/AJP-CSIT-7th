// Step 2 & 3: Create and start threads
public class RunnableTestThread {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("One");
        Thread t1 = new Thread(r1);
        t1.start(); // Start the first thread

        RunnableDemo r2 = new RunnableDemo("Two");
        Thread t2 = new Thread(r2);
        t2.start(); // Start the second thread
    }
}