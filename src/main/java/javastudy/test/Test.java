package javastudy.test;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
//        thread.suspend();
        thread.join(1000);
        System.out.println(thread.getState());
//        thread.resume();
        Thread.sleep(1000);
        System.out.println(thread.getState());
        Thread.sleep(3000);
        System.out.println(thread.getState());

        MyThread2 thread2 = new MyThread2();

    }
}
