package javastudy.io;

import javax.sound.sampled.AudioInputStream;
import java.io.*;

public class SystemTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream;
        ByteArrayInputStream byteArrayInputStream;
        PipedInputStream pipedInputStream;
        AudioInputStream stream;
        PipedOutputStream pipedOutputStream;
//        AudioOutputStream audioOutputStream;

        while (true) {
            int read = System.in.read();
            if (!(read > 0)) break;
            System.out.write(read);
        }
    }
}
