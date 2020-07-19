package tuan1.test2.bai9;

public class Test {
    public static void main(String[] args) {

        Vector vt1 = new Vector();
        Vector vt2 = new Vector();

        vt1.nhap();
        vt1.vector();
        vt1.xuat();

        vt2.nhap();
        vt2.vector();
        vt2.xuat();

        vt1.kiemTraBangNhau(vt2);
        vt1.kiemTraCungPhuong(vt2);
        vt1.gocGiuaHaiVecto(vt2);
        vt1.module(vt2);
        vt1.add(vt2);
        vt1.sub(vt2);
        vt2.mul(vt2);

    }
}
