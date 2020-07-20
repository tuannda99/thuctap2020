package tuan1.day3.bai1;

import java.util.Scanner;

public class Teacher extends Person {
    private String lop;
    private int luong1Gio;
    private int soGioDay;
    private int luongThuc;

    private Scanner scan = new Scanner(System.in);

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getLuong1Gio() {
        return luong1Gio;
    }

    public void setLuong1Gio(int luong1Gio) {
        this.luong1Gio = luong1Gio;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        System.out.println("Nhập lớp dạy: ");
        this.lop = scan.nextLine();

        System.out.println("Nhập lương mỗi giờ: ");
        this.luong1Gio = scan.nextInt();
        scan.nextLine();

        System.out.println("Nhập số giờ dạy trong tháng");
        this.soGioDay = scan.nextInt();

        getLuongThuc();
        scan.nextLine();

    }

    @Override
    public String toString() {
        return super.toString() + "Lớp dạy: " + getLop() +  "\n"
                                + "Lương mỗi giờ: " + getLuong1Gio() + "\n"
                                + "Số giờ dạy trong tháng: " + getSoGioDay() + "\n"
                                + "Lương thực: " + luongThuc + "\n";
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    public int getLuong(){
            return luongThuc;
    }

    public void getLuongThuc(){
        char[] lop = getLop().toCharArray();
        int x = lop.length;
        char kiTuLop = lop[x-1];
        if(Character.toString(kiTuLop).equals("L")
            || Character.toString(kiTuLop).equals("M") ){
            this.luongThuc = luong1Gio * soGioDay + 200000;
        }else this.luongThuc = luong1Gio * soGioDay;
    }
}
