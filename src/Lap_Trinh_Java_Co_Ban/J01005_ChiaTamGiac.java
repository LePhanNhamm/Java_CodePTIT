import java.util.Scanner;
public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (double i=1;i<=n-1;i++) {
                System.out.printf("%.6f ",Math.sqrt((double)h*h*i/n));
            }
            System.out.println();
        }
    }
}
