package tuan1.test2.bai8;

import tuan1.test2.bai7.Fraction;

import java.util.Scanner;

public class SoPhuc {

    private int phanThuc;
    private int phanAo;

    public SoPhuc() {
    }

    public SoPhuc(int phanThuc, int phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public int getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(int phanThuc) {
        this.phanThuc = phanThuc;
    }

    public int getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(int phanAo) {
        this.phanAo = phanAo;
    }

    public void nhapSoPhuc(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập phần thực");
        this.phanThuc = scan.nextInt();

        System.out.println("Nhập phần ảo");
        this.phanAo = scan.nextInt();

    }

    public void inSoPhuc(){
        System.out.println(phanThuc + "i + " + phanAo);
    }

    public void add(SoPhuc sp) {
        int phThuc = this.phanThuc + sp.getPhanThuc();
        int phAo = this.phanAo + sp.getPhanAo();
        System.out.println("Tổng hai số phức = " + phThuc + "i + " + phAo);
    }

    public void sub(SoPhuc sp) {
        int phThuc = this.phanThuc - sp.getPhanThuc();
        int phAo = this.phanAo - sp.getPhanAo();
        System.out.println("Hiệu hai số phức = " + phThuc + "i + " + phAo);
    }

    public void mul(SoPhuc sp) {
        int phThuc = (this.phanThuc * sp.getPhanThuc()) - (this.phanAo * sp.getPhanAo());
        int phAo = (this.phanThuc * sp.getPhanAo()) + (this.phanAo - sp.getPhanThuc());
        System.out.println("Tích hai số phức = " + phThuc + "i + " + phAo);
    }
}
