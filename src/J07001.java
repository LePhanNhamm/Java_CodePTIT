import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        char[] contents = new char[100];
        try {
            // create a reader using the FileReader
            FileReader input = new FileReader("DATA.in");

            // read characters
            input.read(contents);

            // print contents of file
            System.out.println(contents);

            // close FileReader
            input.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
