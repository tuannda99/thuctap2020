package tuan1.day2.bai6;

import java.util.Scanner;

public class Rectangle {

    private double chieuDai;
    private double chieuRong;

    public Rectangle() {
    }

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void inputData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        this.chieuDai = scan.nextDouble();
        System.out.println("Nhập chiều rộng");
        this.chieuRong = scan.nextDouble();
    }

    public void chuVi(){
        System.out.println("Chu vi là: ");
        double chVi = (chieuDai+chieuRong)*2;
        System.out.println(chVi);
    }

    public void dienTich(){
        System.out.println("dienTich là: ");
        double dieTich = chieuDai*chieuRong;
        System.out.println(dieTich);
    }

}
