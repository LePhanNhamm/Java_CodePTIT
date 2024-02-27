package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Kho {
    private String ma,tenhang;
    private long soluong,dongia;

    public Kho(String ma, String tenhang, long soluong, long dongia) {
        this.ma = ma;
        this.tenhang = tenhang;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public double chietkhau() {
        if (soluong>10) return 0.05*dongia*soluong;
        else if (soluong>=8) return 0.02*dongia*soluong;
        else if (soluong>=5) return 0.01*dongia*soluong;
        return 0;
    }
    public long thanhtien() {
        return dongia*soluong-(long)chietkhau();
    }
    public String toString() {
        return ma +  " " + tenhang + " " + (long) chietkhau() + " " + thanhtien();
    }
}
public class J05046_BangKeNhapKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String,Integer> mp = new HashMap<>();
        ArrayList<Kho> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String name = sc.nextLine();
            long soluong = Long.parseLong(sc.nextLine());
            long dongia = Long.parseLong(sc.nextLine());
            String ss[] = name.trim().split("\\s+");
            String ma = ss[0].substring(0,1).toUpperCase()+ss[1].substring(0,1).toUpperCase();
            if (!mp.containsKey(ma)) {
                String id = ma + "01";
                mp.put(ma,2);
                arr.add(new Kho(id,name,soluong,dongia));
            }
            else {
                String id = ma + String.format("%02d",mp.get(ma));
                arr.add(new Kho(id,name,soluong,dongia));
                mp.put(ma,mp.get(ma)+1);
            }
        }
        for (Kho i : arr) {
            System.out.println(i);
        }
    }
}
//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000
