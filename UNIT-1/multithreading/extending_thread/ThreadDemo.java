// Step 1: Create a class that extends the Thread class
class ThreadDemo extends Thread {
    private String threadName;

    ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating: " + threadName);
    }

    // Step 2: Override the run method
    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + " Printing: " + i);
                // Sleep for a while to simulate work
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread: " + threadName + " exiting.");
    }
}