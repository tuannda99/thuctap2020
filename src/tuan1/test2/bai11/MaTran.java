package tuan1.test2.bai11;

import java.util.Scanner;

public class MaTran {
    public int soHang;
    public int soCot;
    public int[][] array;
    private Scanner scan;

    public MaTran() {
    }

    public void nhapMaTran(){
        scan = new Scanner(System.in);
        System.out.println("Nhập sô hàng");
        int m = scan.nextInt();
        this.soHang = m;
        System.out.println("Nhập sô cột");
        int n = scan.nextInt();
        this.soCot = n;
        this.array = new int[n][m];
        System.out.println("Nhập ma trận");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                this.array[i][j] = scan.nextInt();
            }
        }
    }

    public void inMaTran(MaTran mt){
        int m = mt.soHang;
        int n = mt.soCot;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mt.array[i][j] + "     ");
            }
            System.out.println();
        }
    }

    public void congMaTan(MaTran mt){
        int[][] tongMaTran = new int[this.soHang][this.soCot];
        if(this.soHang == mt.soHang && this.soCot == mt.soCot){
            System.out.println(this.soHang);
            System.out.println(mt.soHang);
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < this.soCot; j++){
                    tongMaTran[i][j] = this.array[i][j] + mt.array[i][j];
                }
            }
            System.out.println("Tổng của hai ma trận là: ");
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < this.soCot; j++){
                    System.out.print(tongMaTran[i][j] + "     ");
                }
                System.out.println();
            }
        }else System.out.println("Hai ma trận không cùng hàng cùng cột");

    }

    public void tichMaTran(MaTran mt){
        if(this.soCot == mt.soHang ){
            int[][] tichMaTran = new int[this.soHang][mt.soCot];
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < mt.soCot; j++){
                    tichMaTran[i][j] = 0;
                    for(int k = 0; k < this.soCot; k++){
                        tichMaTran[i][j] = tichMaTran[i][j] + this.array[i][j] * mt.array[i][j];
                    }
                }
            }
            System.out.println("Tích của hai ma trận là: ");
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < mt.soCot; j++){
                    System.out.print(tichMaTran[i][j] + "     ");
                }
                System.out.println();
            }
        }
    }
}
