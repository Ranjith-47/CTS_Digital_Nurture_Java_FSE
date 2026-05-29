import java.io.*;

public class FileReading {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(
                    "C:\\Users\\Ranjith_Ramanathan\\Desktop\\CTS_Digital_Nurture_Java_FSE\\Upskilling\\Core Java\\output.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file");
            e.printStackTrace();
        }
    }
}