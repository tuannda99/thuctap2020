package tuan1.day2.bai16;

public class Test {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,0);
        MyPoint p2 = new MyPoint(0,4);

        p1.distance(p2);
        p1.distance(5,6);

        MyCircle myCircle = new MyCircle(p1,8);
        System.out.println(myCircle.toString());
        myCircle.getArea();
    }
}
