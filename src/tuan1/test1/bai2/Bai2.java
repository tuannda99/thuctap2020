package tuan1.test1.bai2;

import java.util.Scanner;

public class Bai2 {
    static Scanner scan;

    //Tính tiền
    private static double tienTra(double tien){
        if(tien>0 && tien<=25) {
            return tien*1000;
        }else if(tien>25 && tien<=75) {
            return tien*1250;
        }else if(tien>75 && tien<=150) {
            return tien*1800;
        }else if(tien>150) {
            return tien*2500;
        }else{
            System.out.println("Không dùng điên");
        }
        return tien;
    }

    //Nhập và trả về giá tiền
    private static void nhapTra(){
        scan = new Scanner(System.in);
        System.out.println("Nhập số điện");
        double tien = scan.nextInt();
        System.out.println(tienTra(tien));
    }

    public static void main(String[] args) {
        nhapTra();
    }
}
