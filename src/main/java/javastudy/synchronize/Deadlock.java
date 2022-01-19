package javastudy.synchronize;

public class Deadlock {
    Object lock1 = new Object();
    Object lock2 = new Object();

    public void methodA() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("methodA wait for lock1");
        synchronized (lock1) {
            System.out.println("methodA acquired lock1");
            try {
                Thread.sleep(100);
                methodB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void methodB() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("methodB wait for lock2");
        synchronized (lock2) {
            System.out.println("methodB acquired lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            methodA();
        }
    }

}
