package javastudy.test;

public class BlankPrintThread extends Thread{
    public void run(){
        for (int i = 0; i < 300; i++) {
            System.out.print(" ");
            for (int j = 0; j < 100000000; j++) {
                
            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
