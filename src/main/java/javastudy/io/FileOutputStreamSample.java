package javastudy.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSample {
    public static void main(String[] args) {
        File file = new File("/Users/yangseung-in/Desktop/javastudy.test.txt");

        try (FileOutputStream fos = new FileOutputStream(file)) {
            int data;
            while ((data = System.in.read()) != 49) { //1입력시 종료
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
