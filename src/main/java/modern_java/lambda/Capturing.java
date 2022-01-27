package modern_java.lambda;

public class Capturing {
    private static int port=8080;
    public static void main(String[] args) {
        int prodPort=80;
        Runnable r = () -> System.out.println(port);
        port=9090;
        r.run();

        Runnable r2 = () -> System.out.println(prodPort);
//        prodPort=443;//불가능

    }
}
