// Step 1: Implement the Runnable interface
class RunnableDemo implements Runnable {
    private String threadName;

    RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("Creating: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + " Printing: " + i);
                // Sleep for a while to simulate work
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread: " + threadName + " exiting");
    }
}
