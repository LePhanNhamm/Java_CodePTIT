import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.divide(b).multiply(b).equals(a)|| b.divide(a).multiply(a).equals(b)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
