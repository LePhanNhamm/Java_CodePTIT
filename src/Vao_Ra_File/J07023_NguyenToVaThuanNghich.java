
package Vao_Ra_File;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class J07023_NguyenToVaThuanNghich {
    public static boolean check(int n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) return false;
        }
        return n>1;
    }
    public static boolean check2(int n) {
        int a[] = new int[5];
        int k = 0;
        while (n!=0) {
            a[k++] = n%10;
            n/=10;
        }
        for (int i=0;i<k/2;i++) {
            if (a[i]!=a[k-1-i]) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream(new File("DATA1.in")));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc1.readObject();
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream(new File("DATA2.in")));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) sc2.readObject();
        int d1[] = new int[10000];
        int d2[] = new int[10000];
        for (Integer i : arr) {
            d1[i]++;
        }
        for (Integer i : arr2) {
            d2[i]++;
        }
        for (int i=1;i<10000;i++) {
            if (check2(i) && check(i) && d1[i]>0 && d2[i]>0) {
                System.out.println(i + " " + d1[i] + " " + d2[i]);
            }
        }
    }
}
