package modern_java.lambda;

public class FunctionalInterface {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello 1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello 2");
            }
        };

        process(r1);
        process(r2);
        process(() -> System.out.println("Hello 3"));
    }

    public static void process(Runnable r){
        r.run();
    }
}
