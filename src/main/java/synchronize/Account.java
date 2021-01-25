package synchronize;

public class Account {
    public static void main(String[] args) {
        Account account = new Account(100_000);
        Runnable runnable = () -> account.withdraw(50_000);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("작업후 잔액" + account.getBalance());
    }
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    //메소드를 임계 구역으로 설정
    public synchronized int withdraw(int money) {
        if (this.balance < money) {
            System.out.println("잔액부족");
            return 0;
        }
        try {
            Thread.sleep(1000); //인출 지연시간
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance -= money;
        System.out.println("찾으신 금액: " + money);
        System.out.println("출금후 잔고: " + balance);

        return balance;
    }
    //특정 구역 임계구역으로 설정
    public int withdraw2(int money) {
        synchronized (this) {
            if (this.balance < money) {
                System.out.println("잔액부족");
                return 0;
            }
            try {
                Thread.sleep(1000); //인출 지연시간
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.balance -= money;
        }

        System.out.println("찾으신 금액: " + money);
        System.out.println("출금후 잔고: " + balance);

        return balance;
    }
}
