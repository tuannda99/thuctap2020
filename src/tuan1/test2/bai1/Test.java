package tuan1.test2.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void menu(){
        System.out.println("1- Nhập thông tin nhân viên");
        System.out.println("2- In thông tin nhân viên");
        System.out.println("3- Thoát");
    }

    public static void yeuCau(){
        ArrayList<NhanVien> nhanVien = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int i = 1;
        while (i > 0){
            System.out.println("----------------------");
            menu();
            System.out.println("Nhập số lựa chọn");
            int index = scan.nextInt();
            switch(index) {
                case 1:
                    NhanVien nhvien = new NhanVien();
                    nhvien.inputInfo();
                    nhanVien.add(nhvien);
                    break;
                case 2:
                    for(int k = 0; k < nhanVien.size(); k++){
                        nhanVien.get(k).tinhThuong();
                        nhanVien.get(k).printInfo();
                    }
                    break;
                case 3:
                    i = i-1;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        yeuCau();
    }
}
