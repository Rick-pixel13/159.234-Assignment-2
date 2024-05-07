import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\patri\\Desktop\\159234\\Assignment 2\\src\\library.txt")));
            String item;
            try {
                while (scanner.hasNext()) {
                    item = scanner.next();
                    System.out.println(item);
                }
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}