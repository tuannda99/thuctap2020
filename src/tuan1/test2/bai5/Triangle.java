package tuan1.test2.bai5;

public class Triangle {
    private double canhA;
    private double canhB;
    private double canhC;

    public Triangle() {
    }

    public Triangle(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public boolean isTamGiacVuong() {
        if (canhC > canhB && canhC > canhA) {
            if (canhC * canhC == canhA * canhA + canhB * canhB) return true;
            else return false;
        } else if (canhB > canhC && canhB > canhA) {
            if (canhB * canhB == canhA * canhA + canhC * canhC) return true;
            else return false;
        } else {
            if (canhA * canhA == canhB * canhB + canhC * canhC) return true;
            else return false;
        }
    }

    public void kieuTamGiac(){
        if(canhA == canhB && canhB == canhC){
            System.out.println("Là tam giác đều");
        }else if(canhA == canhB || canhB == canhC || canhC == canhA){
            System.out.println("Là tam giác cân ");
        }else if(isTamGiacVuong() == true){
            System.out.println("Là tam giac vuông");
        } else System.out.println("Là tam giác");
    }

    public double chuVi(){
        return canhA + canhB + canhC;
    }

    public double dienTich(){
        double cVi = chuVi();
        double p = cVi/2;
        return Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
    }

}
