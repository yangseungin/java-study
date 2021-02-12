package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchResources {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("tmp.txt");) {
            //작업
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
