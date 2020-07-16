package tuan1.test1.bai3;

public class Bai3 {
    public static class Square{
        private float doDaiCanh;
        private float chuVi;
        private float dienTich;

        Square(float doDaiCanh){
            this.doDaiCanh = doDaiCanh;
        }

        private void hienThiCanh(){
            System.out.println(this.doDaiCanh);
        }
        private void hienThiChuVi(){
            this.chuVi = this.doDaiCanh*4;
            System.out.println(chuVi);
        }
        private void hienThiDienTich(){
            this.dienTich = this.doDaiCanh*this.doDaiCanh;
            System.out.println(dienTich);
        }
        private void hienThiTatCa(){
            System.out.println(doDaiCanh);
            System.out.println(chuVi);
            System.out.println(dienTich);
        }
    }

    public static void main(String[] args) {
        Square hinhVuong = new Square(5);
        hinhVuong.hienThiCanh();
        hinhVuong.hienThiChuVi();
        hinhVuong.hienThiDienTich();
        hinhVuong.hienThiTatCa();
    }

}
