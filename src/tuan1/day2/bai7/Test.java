package tuan1.day2.bai7;

public class Test {
    public static void main(String[] args) {
        Fraction ps = new Fraction();
        Fraction ps1 = new Fraction(1,3);

        ps.nhapPhanSo();
        ps.inPhanSo();
        ps.nghicDaoPhanSo();

        ps.add(ps1);
        ps.sub(ps1);
        ps.mul(ps1);
        ps.div(ps1);
    }
}
