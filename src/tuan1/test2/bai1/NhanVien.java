package tuan1.test2.bai1;

import java.util.Scanner;

public class NhanVien {

    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int soGioLam;

    public NhanVien(){
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int soGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.soGioLam = soGioLam;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public void inputInfo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập tên");
        this.ten = scan.nextLine();

        System.out.println("Nhập tuổi");
        this.tuoi = scan.nextInt();

        System.out.println("Nhập địa chỉ");
        scan.nextLine();
        this.diaChi = scan.nextLine();

        System.out.println("Nhập lương");
        this.tienLuong = scan.nextDouble();

        System.out.println("Nhập số giờ làm");
        this.soGioLam = scan.nextInt();
    }

    public String toString(){
        return "Tên: " + ten + "\n"
                + "Tuổi: " + tuoi + "\n"
                + "Địa chỉ : " + diaChi + "\n"
                + "Tiền lương : " + tienLuong + "\n"
                + "Số giờ làm : " + soGioLam + "\n";
    }

    public void printInfo(){
        System.out.println("------------");
        System.out.println(toString());
    }

    public double tinhThuong() {
        if(soGioLam >= 200) tienLuong = tienLuong * 1.2;
        else if(soGioLam < 200 && soGioLam >= 100) tienLuong = tienLuong * 1.1;
        return tienLuong;
    }
}
