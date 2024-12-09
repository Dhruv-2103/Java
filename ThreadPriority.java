class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + getName() + " | Priority: " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        // Create threads with different names
        CustomThread thread1 = new CustomThread("Thread-1");
        CustomThread thread2 = new CustomThread("Thread-2");
        CustomThread thread3 = new CustomThread("Thread-3");

        // Set the priorities of the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread3.setPriority(Thread.MAX_PRIORITY); // 10

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
