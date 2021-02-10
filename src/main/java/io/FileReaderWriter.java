package io;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) {
        File readFile = new File("/Users/yangseung-in/Desktop/readFile.txt");
        File writeFile = new File("/Users/yangseung-in/Desktop/writeFile.txt");
        try (FileReader fr = new FileReader(readFile);
             BufferedReader reader = new BufferedReader(fr);
             FileWriter fw = new FileWriter(writeFile);
             BufferedWriter writer = new BufferedWriter(fw)) {

            String read = null;
            //읽은 파일을 새로운 파일에 쓰기
            while ((read = reader.readLine()) != null) {
                System.out.println(read);
                writer.write(read);
                writer.newLine();
            }
            //writeFile에 새로운 스트링 추가
            String newString = "Yang";
            writer.write(newString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
