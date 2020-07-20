package tuan1.day2.bai10;

import java.util.Scanner;

public class DaThuc {
    private int n;
    private double a[];

    public DaThuc() {
        n = 0;
        a = null;
    }

    public int getN(){
        return n;
    }
    public void setN(int n){
            this.n  = n;
    }

    public double[] getA(){
        return a;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập bậc của đa thức: ");
        this.n = scan.nextInt();

        this.a = new double[n+1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Bậc thứ " + i + " ");
            this.a[i] = scan.nextDouble();
        }
        System.out.println();

    }
    public void output() {

        for (int i = 0; i < a.length; i++) {
            if (i == 0)
                System.out.print(a[i] + " * X^" + i);
            else
                System.out.print(" + " + a[i] + " * X^" + i);
        }
        System.out.println(" ");
    }

    public DaThuc add(DaThuc a) {

        DaThuc c = new DaThuc();

        int x = this.n >= a.n ? this.n : a.n;

        c.n = x;
        c.a = new double[x+1];

        int j = this.n < a.n ? this.n : a.n;

        for(j=j + 1;j <= x;j++){
            c.a[j] = this.n > a.n ? this.a[j] : a.a[j];
            System.out.println(c.a[j]);
        }

        int m = this.n <= a.n ? this.n : a.n;

        for (int i = 0; i <= m; i++) {
            c.a[i] = this.a[i] + a.a[i] ;
        }
        return c;
    }

    public DaThuc mul(DaThuc a) {

        DaThuc c = new DaThuc();

        c.n = this.n + a.n;
        c.a = new double[c.n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= a.n; j++) {
                c.a[i+j] = c.a[i+j] + this.a[i] *a.a[j];
            }
        }
        return c;
    }





}
