package javastudy.synchronize;

public class DeadlockTest {
    public static void main(String[] args) {
        Deadlock deadLock = new Deadlock();
        Thread t1 = new Thread(() -> deadLock.methodA());
        Thread t2 = new Thread(() -> deadLock.methodB());
        t1.start();
        t2.start();
    }
}
