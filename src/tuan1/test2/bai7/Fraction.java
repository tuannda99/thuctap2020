package tuan1.test2.bai7;

import java.util.Scanner;

public class Fraction {

    private int tuSo;
    private int mauSo;

    public Fraction() {
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void nhapPhanSo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập tử số");
        this.tuSo = scan.nextInt();

        System.out.println("Nhập mẫu số");
        this.mauSo = scan.nextInt();

    }

    public void inPhanSo(){
        System.out.println(tuSo + "/" + mauSo);
    }

    public void nghicDaoPhanSo(){
        int temple = getTuSo();
        this.tuSo = getMauSo();
        this.mauSo = temple;
        inPhanSo();
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo(){
        int i = timUSCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / i);
        this.setMauSo(this.getMauSo() / i);
    }

    public void add(Fraction ps) {
        int tSo = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int mSo = this.getMauSo() * ps.getMauSo();
        Fraction phanSoTong = new Fraction(tSo, mSo);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }

    public void sub(Fraction ps) {
        int tSo = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int mSo = this.getMauSo() * ps.getMauSo();
        Fraction phanSoTong = new Fraction(tSo, mSo);
        phanSoTong.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }



    public void mul(Fraction ps) {
        int tSo = this.getTuSo() * ps.getTuSo();
        int mSo = this.getMauSo() * ps.getMauSo();
        Fraction phanSoTich = new Fraction(tSo, mSo);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }

    public void div(Fraction ps) {
        int tSo = this.getTuSo() * ps.getMauSo();
        int mSo = this.getMauSo() * ps.getTuSo();
        Fraction phanSoTich = new Fraction(tSo, mSo);
        phanSoTich.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }





}
