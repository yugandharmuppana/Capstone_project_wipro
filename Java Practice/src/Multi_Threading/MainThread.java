package Multi_Threading;

class TestThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome");
        }

        System.out.println("Print id for thread = " + Thread.currentThread().getId());
        System.out.println("Current name = " + Thread.currentThread().getName());

        Thread.currentThread().setName("Print_welcome_message");
        System.out.println("New name is = " + Thread.currentThread().getName());

        System.out.println("Priority test1 is = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("New Priority for test1 is = " + Thread.currentThread().getPriority());

        System.out.println("Is thread alive? " + Thread.currentThread().isAlive());
    }
}

// ✅ Renamed this class
public class MainThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello ");
        }

        System.out.println("Priority test is = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println("New Priority for test is = " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread1 t1 = new TestThread1();
        MainThread t2 = new MainThread();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Is t1 alive after join? " + t1.isAlive());
    }
}
