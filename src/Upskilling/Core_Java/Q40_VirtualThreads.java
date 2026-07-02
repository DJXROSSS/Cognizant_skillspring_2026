package Upskilling.Core_Java;

public class Q40_VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        int virtualThreadCount = 100_000;
        int platformThreadCount = 1_000;

        long virtualStart = System.currentTimeMillis();
        Thread[] virtualThreads = new Thread[virtualThreadCount];
        for (int i = 0; i < virtualThreadCount; i++) {
            final int id = i;
            virtualThreads[i] = Thread.startVirtualThread(() -> System.out.println("Virtual thread " + id + " running"));
        }
        for (Thread thread : virtualThreads) {
            thread.join();
        }
        long virtualDuration = System.currentTimeMillis() - virtualStart;

        long platformStart = System.currentTimeMillis();
        Thread[] platformThreads = new Thread[platformThreadCount];
        for (int i = 0; i < platformThreadCount; i++) {
            final int id = i;
            platformThreads[i] = new Thread(() -> System.out.println("Platform thread " + id + " running"));
            platformThreads[i].start();
        }
        for (Thread thread : platformThreads) {
            thread.join();
        }
        long platformDuration = System.currentTimeMillis() - platformStart;

        System.out.println("Virtual threads time: " + virtualDuration + " ms");
        System.out.println("Platform threads time: " + platformDuration + " ms");
    }
}
