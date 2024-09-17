class CustomThread extends Thread {
    CustomThread(String name) {
        this.setName(name);  // Set thread name
    }

    public synchronized void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(this.getName() + " is running with priority " + this.getPriority());
                Thread.sleep(1000);  // Pause thread for 0.5 second
            }
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " was interrupted");
        }
    }
}