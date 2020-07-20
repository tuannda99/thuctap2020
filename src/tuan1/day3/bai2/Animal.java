package tuan1.day3.bai2;

import java.util.Scanner;

public abstract class Animal {
    private String ten;
    private int tuoi;
    private String moTa;

    public abstract void tiengKeu();

    public Animal() {
    }

    public Animal(String ten) {
        this.ten = ten;
    }

    public Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Animal(String ten, int tuoi, String moTa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String toString(){
        return "Tên: " + ten + "\n"
                + "Tuổi: " + tuoi + "\n"
                + "Mô tả: " + moTa + "\n";
    }

    public void inputAnimal(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Tên: ");
        this.setTen(scan.nextLine());

        System.out.println("Tuổi: ");
        this.setTuoi(scan.nextInt());
        scan.nextLine();

        System.out.println("Mô tả: ");
        this.setMoTa(scan.nextLine());
    }

    public void xemThongtin(){
        System.out.println(toString());
    }

}
