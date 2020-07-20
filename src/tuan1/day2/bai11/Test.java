package tuan1.day2.bai11;

public class Test {
    public static void main(String[] args) {

        System.out.println("Nhập ma trận A");
        MaTran mtA = new MaTran();
        mtA.nhapMaTran();
        mtA.inMaTran(mtA);

        System.out.println("Nhập ma trận B");
        MaTran mtB = new MaTran();
        mtB.nhapMaTran();
        mtB.inMaTran(mtB);

        mtA.congMaTan(mtB);
        mtA.tichMaTran(mtB);

    }
}
