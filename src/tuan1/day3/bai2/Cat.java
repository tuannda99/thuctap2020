package tuan1.day3.bai2;

public class Cat extends Animal {

    @Override
    public void tiengKeu() {
        System.out.println("Mèo kêu ......");
    }

    @Override
    public void xemThongtin() {
        super.xemThongtin();
    }
}
