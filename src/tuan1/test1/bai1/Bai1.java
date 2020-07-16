package tuan1.test1.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    static Scanner scan;

    //Nhập các hệ số phương trình bậc 2
    private static int[] nhapHeSo(){
        scan = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = scan.nextInt();
        System.out.println("Nhập b");
        int b = scan.nextInt();
        System.out.println("Nhập c");
        int c = scan.nextInt();
        return new int[]{a,b,c};
    }

    //Tính delta
    private static double deltaBac2(int a, int b, int c){
        return b*b - 4*a*c;
    }

    public static void main(String[] args){
        int[] array = nhapHeSo();
        if (deltaBac2(array[0],array[1],array[2]) < 0){
            System.out.println("null");
        } else{
            double x = Math.sqrt(deltaBac2(array[0],array[1],array[2]));
            System.out.println(x);
        }


    }
}
