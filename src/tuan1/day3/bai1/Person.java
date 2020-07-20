package tuan1.day3.bai1;

import java.util.Scanner;

public class Person {

    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String toString(){
        return "Tên: " + ten + "\n"
                + "Giới tính: " + gioiTinh + "\n"
                + "Ngày sinh: " + ngaySinh + "\n"
                + "Địa chỉ: " + diaChi + "\n";
    }

    public void inputInfo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        setTen(scan.nextLine());

        System.out.println("Nhập giới tính: ");
        setGioiTinh(scan.nextLine());

        System.out.println("Nhập ngày sinh: ");
        setNgaySinh(scan.nextLine());

        System.out.println("Nhập đại chỉ: ");
        setDiaChi(scan.nextLine());
    }

    public void showInfo(){
        System.out.println(toString());
    }

}
