import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();

        }
        for (int i=0;i<n-1;i++) {
            int ok = 1;
            for (int j=0;j<n-1-i;j++) {
                if (a[j]>a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    ok=0;
                }
            }
            if (ok==1) break;
            System.out.print("Buoc " + (i+1) +": ");
            for (int k = 0;k<n;k++) {
                System.out.print(a[k] + " ");

            }
            System.out.println();
        }
    }
}
