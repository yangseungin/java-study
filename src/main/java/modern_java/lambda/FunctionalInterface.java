package modern_java.lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

    public String processFile() throws IOException {
        try ( BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }
}
