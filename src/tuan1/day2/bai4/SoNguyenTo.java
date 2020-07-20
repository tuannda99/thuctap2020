package tuan1.day2.bai4;

public class SoNguyenTo {

    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int x){
        if (isSoNguyenTo(x) == true) this.a = x;
        else System.out.println("x không phải số nguyên tố không lưu trữ");
    }

    public boolean isSoNguyenTo(int x){
        if(x < 2) return false;
        for(int i = 2; i <= (int)Math.sqrt(x);i++){
            if(x % i == 0) return false;
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        int nghiem = a + 1;
        int index = 1;
        while(index == 1){
            if (isSoNguyenTo(nghiem) == false){
                nghiem++;
            }
            else{
                index = index - 1;
            }
        }
        return -1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSoNguyenTo(a) == true) this.a = a;
    }
}
