package tuan1.day3.bai1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student extends Person {

    private String maSV;
    private  double diemTB;
    private String email;
    private Scanner scan = new Scanner(System.in);
    private static final String EMAIL_PATTERN = "(?=.*[@])";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public String getMaSV() {
        return maSV;
    }

    public boolean validate(final String email){
        return pattern.matcher(email).matches();
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

    public double getDiemTB() {
        return diemTB;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        int i = 1;
        while (i == 1){
            if(validate(email)==false){
                this.email = email;
                i = i - 1;
            }else {
                System.out.println("Nhập lại");
                email = scan.nextLine();
            }
        }
        this.email = email;
    }

    @Override
    public void inputInfo() {
        Scanner scan = new Scanner(System.in);
        super.inputInfo();

        System.out.println("Nhập mã sinh viên (chứa 8 kí tự): ");
        setMaSV(scan.nextLine());

        System.out.println("Nhập điểm trung bình (từ 0.0 đến 10.0): ");
        setDiemTB(scan.nextDouble());
        scan.nextLine();

        System.out.println("Nhập email (phải chứa kí tự @ và không tồn tại khoảng trắng):");
        setEmail(scan.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "Mã sinh viên: " + getMaSV() + "\n"
                                + "Điểm trung bình: " + getDiemTB() + "\n"
                                + "Email: " + getEmail() + "\n";
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    public boolean isHocBong(){
        return getDiemTB() >= 8.0 ? true : false;
    }

}
