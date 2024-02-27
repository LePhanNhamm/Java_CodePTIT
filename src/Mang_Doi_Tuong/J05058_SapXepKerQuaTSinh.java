package Mang_Doi_Tuong;

import java.security.cert.CertPath;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThiSinh2 implements Comparable<ThiSinh2> {
    private String ma,ten,makv,tt,dut;
    private double toan,ly,hoa,tong,tongdiem;


    public ThiSinh2(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        makv = ma.substring(0,3);
        tongdiem = toan*2 + ly + hoa;
        if (makv.equals("KV1")) {
            tong = toan*2 + ly + hoa + 0.5;
            dut = "0.5";
        }
        else if (makv.equals("KV2")) {
            tong = toan*2 + ly + hoa + 1;
            dut = "1";
        }
        else {
            tong = toan*2 + ly + hoa + 2.5;
            dut = "2.5";
        }
        if (tong>=24) {
            tt = "TRUNG TUYEN";
        }
        else {
            tt = "TRUOT";
        }

    }
    public String reNumber(double a) {
        DecimalFormat f = new DecimalFormat("#.#");
        return f.format(a);
    }
    public int compareTo(ThiSinh2 o1 ) {
        if (this.tong == o1.tong) {
            return this.ma.compareTo(o1.ma);
        }
        return this.tong<o1.tong?1:-1;
    }
    public String toString() {
        return ma + " " + ten + " " + dut +  " " +  reNumber(tong) + " " + tt;
    }
}
public class J05058_SapXepKerQuaTSinh  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh2> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new ThiSinh2(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for (ThiSinh2 i : arr) {
            System.out.println(i);
        }
    }
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7

