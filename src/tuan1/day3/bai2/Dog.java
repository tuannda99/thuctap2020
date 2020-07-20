package tuan1.day3.bai2;

public class Dog extends Animal {

    @Override
    public void tiengKeu() {
        System.out.println("Chó kêu ......");
    }

    @Override
    public void xemThongtin() {
        super.xemThongtin();
    }
}
