package J05024_LietKeSinhVienTheoNganh;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<J05024_LietKeSinhVienTheoNganh.SinhVien> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new J05024_LietKeSinhVienTheoNganh.SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-->0) {
            String nganh = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
            for (J05024_LietKeSinhVienTheoNganh.SinhVien i : arr) {
                Character cr = i.getLop().charAt(0);
                if (i.getNganh().equalsIgnoreCase(nganh)) {
                    System.out.println(i);
                }
            }
        }
    }
}
//4
//E16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//Ke toan

