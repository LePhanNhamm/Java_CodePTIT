import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class baitap7_TinhTongSoLong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                try {
                    long y = Long.parseLong(s);
                    sum+=y;
                } catch (NumberFormatException ex) {

                }
            }
        }
        System.out.println(sum);
    }
}
