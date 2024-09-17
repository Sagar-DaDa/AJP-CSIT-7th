// Step 3: Create and start threads
public class TestThread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("t1");
        t1.start(); // Start the first thread

        ThreadDemo t2 = new ThreadDemo("t2");
        t2.start(); // Start the second thread
    }
}