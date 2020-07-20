package tuan1.day2.bai8;

public class Test {
    public static void main(String[] args) {
        SoPhuc sp = new SoPhuc();
        SoPhuc sp1 = new SoPhuc(1,3);

        sp.nhapSoPhuc();
        sp.inSoPhuc();

        sp.add(sp1);
        sp.sub(sp1);
        sp.mul(sp1);


    }
}
