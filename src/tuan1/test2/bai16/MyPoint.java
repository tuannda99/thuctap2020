package tuan1.test2.bai16;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(x,y) = (" + x +", " + y + ")";
    }

    public void distance(int x, int y){
        int hoanhDo = (x - this.x) * (x - this.x);
        int tungDo = (y - this.y) * (y - this.y);
        double dis = Math.sqrt(hoanhDo + tungDo);
        System.out.println("Khoảng cách giữa 2 điểm: " + dis);
    }

    public void distance(MyPoint point1){
        int hoanhDo = (x - point1.x) * (x - point1.x);
        int tungDo = (y - point1.y) * (y - point1.y);
        double dis = Math.sqrt(hoanhDo + tungDo);
        System.out.println("Khoảng cách giữa 2 điểm: " + dis);
    }






}

