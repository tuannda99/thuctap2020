package tuan1.day2.bai9;

import java.util.Scanner;

public class Vector {

    private int hoanhDoDau;
    private int tungDoDau;
    private int hoanhDoSau;
    private int tungDoSau;
    private int hoanhDo;
    private int tungDo;


    public Vector() {
    }

    public int getHoanhDoDau() {
        return hoanhDoDau;
    }

    public void setHoanhDoDau(int hoanhdoDau) {
        this.hoanhDoDau = hoanhdoDau;
    }

    public int getTungDoDau() {
        return tungDoDau;
    }

    public void setTungDoDau(int tungdoDau) {
        this.tungDoDau = tungdoDau;
    }

    public int getHoanhDoSau() {
        return hoanhDoSau;
    }

    public void setHoanhDoSau(int hoanhdoSau) {
        this.hoanhDoSau = hoanhdoSau;
    }

    public int getTungDoSau() {
        return tungDoSau;
    }

    public void setTungDoSau(int tungdoSau) {
        this.tungDoSau = tungdoSau;
    }

    public void nhap() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hoành độ đầu: ");
        this.hoanhDoDau = scan.nextInt();

        System.out.println("Tung độ đầu: ");
        this.tungDoDau = scan.nextInt();

        System.out.println("Hoành độ sau: ");
        this.hoanhDoSau = scan.nextInt();

        System.out.println("Tung độ sau: ");
        this.tungDoSau = scan.nextInt();
    }

    public void vector(){
        this.hoanhDo = hoanhDoSau - hoanhDoDau;
        this.tungDo = tungDoSau - tungDoDau;
    }


    public void xuat(){
        System.out.println("Tọa độ vecto : " + "(" + hoanhDo + ", " + tungDo + ")");
    }

    public void kiemTraBangNhau(Vector vt){
        if(hoanhDo == vt.hoanhDo && tungDo == vt.tungDo){
            System.out.println("Hai vecto bằng nhau");
        } else System.out.println("Hai vecto không bằng nhau");
    }

    public void gocGiuaHaiVecto(Vector vt){
        double cosTuSo = (hoanhDo * vt.hoanhDo) + (tungDo * vt.tungDo);
        double cosMauSo1 = Math.sqrt(hoanhDo * hoanhDo + tungDo * tungDo);
        double cosMauSo2 = Math.sqrt(vt.hoanhDo * vt.hoanhDo + vt.tungDo * vt.tungDo);
        double cos = cosTuSo/(cosMauSo1*cosMauSo2);
        System.out.println("Cos góc giữa 2 vector: " + cos);
    }

    public void module(Vector vt){
        double hoanhDoModule = hoanhDo - vt.hoanhDo;
        double tungDoModdule = tungDo = vt.tungDo;
        double module = Math.sqrt(hoanhDoModule * hoanhDoModule + tungDoModdule * tungDoModdule);
        System.out.println("Module: " + module);
    }

    public void kiemTraCungPhuong(Vector vt){
        int k = vt.hoanhDo - hoanhDo;
        System.out.println(k == 0 ? "Hai vector cùng phương" : "Hai vecter không cùng phương");
    }

    public void add(Vector vt){
        int hoanhDoSum = hoanhDo + vt.hoanhDo;
        int tungDoSum = tungDo + vt.tungDo;
        System.out.println("Tổng 2 vector: (" + hoanhDoSum + " ,"+ tungDoSum + ")");
    }

    public void sub(Vector vt){
        int hoanhDoSub = hoanhDo - vt.hoanhDo;
        int tungDoSub = tungDo - vt.tungDo;
        System.out.println("Hiệu 2 vector: (" + hoanhDoSub + " ,"+ tungDoSub + ")");
    }

    public void mul(Vector vt){
        int hoanhDoMul = hoanhDo * vt.hoanhDo;
        int tungDoMul = tungDo * vt.tungDo;
        System.out.println("Tich 2 vector: (" + hoanhDoMul + " ,"+ tungDoMul + ")");
    }
}
