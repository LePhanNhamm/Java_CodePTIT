import java.util.Scanner;
public class J01002_TongNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- >0) {
            long N = sc.nextLong();
            System.out.println(N*(N+1)/2);
        }
    }
}
