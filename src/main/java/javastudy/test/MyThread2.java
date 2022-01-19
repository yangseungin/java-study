package javastudy.test;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        //작업
        System.out.println("MyThread2 run");

        System.out.println("MyThread2 end");
    }
}
