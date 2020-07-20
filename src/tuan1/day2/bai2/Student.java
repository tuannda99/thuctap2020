package tuan1.day2.bai2;

import java.util.Scanner;

public class Student {

    private String maSV;
    private double diemTB;
    private int tuoi;
    private String lop;
    private String hocBong;
    private Scanner scan = new Scanner(System.in);


    public Student() {
    }

    public Student(String maSV, double diemTB, int tuoi, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setMaSV(String maSV) {
        int i = 1;
        while (i == 1){
            if(maSV.length() == 8){
                this.maSV = maSV;
                i = i - 1;
            }else {
                System.out.println("Nhập lại");
                maSV = scan.nextLine();
            }
        }
        this.maSV = maSV;
    }

    public void setDiemTB(double diemTB) {
        int i = 1;
        while (i == 1){
           if(diemTB >= 0.0 && diemTB <= 10.0){
               this.diemTB = diemTB;
               i = i - 1;
           }else {
               System.out.println("Nhập lại");
               diemTB = scan.nextDouble();
           }
        }
        this.diemTB = diemTB;
    }

    public void setTuoi(int tuoi) {
        int i = 1;
        while (i == 1){
            if(tuoi >= 18){
                this.tuoi = tuoi;
                i = i - 1;
            }else {
                System.out.println("Nhập lại");
                tuoi = scan.nextInt();
            }
        }
        this.tuoi = tuoi;
    }

    public void setLop(String lop) {

        int i = 1;
        while (i == 1){
            char[] lopHoc = lop.toCharArray();
            if(lopHoc[0] == 'A' || lopHoc[0] == 'C'){
                this.lop = lop;
                i = i - 1;
            }else {
                System.out.println("Nhập lại");
                lop = scan.nextLine();
            }
        }
        this.lop = lop;
    }

    public void inputInfo(){

        System.out.println("Nhập mã sinh viên (phải chứa 8 kí tự)");
        String inputMaSV = scan.nextLine();
        setMaSV(inputMaSV);

        System.out.println("Nhập điểm trung bình (phải từ 0.0 - 10.0)");
        double inputdiemTB = scan.nextDouble();
        setDiemTB(inputdiemTB);

        System.out.println("Nhập tuổi (phải lớn hơn 18)");
        int inputTuoi = scan.nextInt();
        setTuoi(inputTuoi);
        scan.nextLine();

        System.out.println("Lớp (phải bắt đầu bởi A hoặc C)");
        String inputLop = scan.nextLine();
        setLop(inputLop);

    }

    public String toString(){
        return "Mã Sinh Viên: " + maSV + "\n"
                + "Điểm Trung Bình: " + diemTB + "\n"
                + "Tuổi : " + tuoi + "\n"
                + "Lớp : " + lop + "\n"
                + "Học Bổng : " + hocBong + "\n";
    }

    public void showInfo(){
        xetHocBong();
        System.out.println(toString());
    }

    public void xetHocBong(){
        if(diemTB >= 8.0){
            this.hocBong = "Có";
        }else this.hocBong = "Không";
    }
}
