package tuan1.test2.bai10;

public class Test {
    public static void main(String[] args) {

        DaThuc daThucA = new DaThuc();
        DaThuc daThucB = new DaThuc();

        daThucA.input();
        daThucA.output();

        daThucB.input();
        daThucB.output();

        System.out.println("Tổng của 2 đa thức");
        daThucA.add(daThucB).output();

        System.out.println("Tích của 2 đa thức");
        daThucA.mul(daThucB).output();





    }
}
