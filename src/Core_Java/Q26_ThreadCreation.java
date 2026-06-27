package Core_Java;

public class Q26_ThreadCreation {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new MessageThread("Thread-1");
        Thread second = new MessageThread("Thread-2");

        first.start();
        second.start();

        first.join();
        second.join();
    }
}

class MessageThread extends Thread {
    MessageThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " says hello " + i);
        }
    }
}
