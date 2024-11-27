class SharedResource {
    // Synchronized method
    public synchronized void synchronizedMethod(String threadName) {
        System.out.println(threadName + " entered synchronizedMethod.");
        try {
            Thread.sleep(1000); // Simulating work
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(threadName + " exiting synchronizedMethod.");
    }

    // Method with a synchronized block
    public void methodWithSynchronizedBlock(String threadName) {
        System.out.println(threadName + " attempting to enter synchronized block.");
        synchronized (this) {
            System.out.println(threadName + " entered synchronized block.");
            try {
                Thread.sleep(1000); // Simulating work
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(threadName + " exiting synchronized block.");
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Thread using synchronized method
        Thread t1 = new Thread(() -> resource.synchronizedMethod("Thread 1"));

        // Thread using synchronized block
        Thread t2 = new Thread(() -> resource.methodWithSynchronizedBlock("Thread 2"));

        t1.start();
        t2.start();
    }
}
