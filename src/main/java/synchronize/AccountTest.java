package synchronize;

public class AccountTest {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(100_000);
        Runnable runnable = () -> account.withdraw(50_000);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        Thread.sleep(2000);
        System.out.println("작업후 잔액" + account.getBalance());


    }
}
