package javastudy.test;

public class MyThread extends Thread {
    public void run() {
        //작업
        System.out.println("MyThread run");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread end");
    }
}
