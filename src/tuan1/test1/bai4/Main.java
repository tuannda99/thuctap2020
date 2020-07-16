package tuan1.test1.bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static News news;
    public static Scanner scan;
    public static ArrayList<News> array;

    public static void menu(){

        System.out.println("1-Insert news");
        System.out.println("2-View list news");
        System.out.println("3-Average rate");
        System.out.println("4-Exit");

    }

    public static void fun1(){

        scan = new Scanner(System.in);
        System.out.println("Nhập title");
        String title = scan.nextLine();
        System.out.println("Nhập publishDate");
        String publishDate = scan.nextLine();
        System.out.println("Nhập author");
        String author = scan.nextLine();
        System.out.println("Nhập content");
        String content = scan.nextLine();

        news = new News(title,publishDate,author,content);
        System.out.println("Nhập 3 đánh giá");
        news.setRateList();
        news.rateList[0] = scan.nextInt();
        news.rateList[1] = scan.nextInt();
        news.rateList[2] = scan.nextInt();
        array = new ArrayList();
        array.add(news);
    }

    public static void fun2(){
        array.get(0).display();
    }

    public static void fun3(){
        array.get(0).calculate();
        array.get(0).display();
    }



    public static void main(String[] args) {
        int i = 1;
        while (i > 0){
            System.out.println("----------------------");
            menu();
            System.out.println("Nhập số lựa chọn");
            scan = new Scanner(System.in);
            int index = scan.nextInt();
            switch(index) {
                case 1:
                    fun1();
                    break;
                case 2:
                    fun2();
                    break;
                case 3:
                    fun3();
                    break;
                case 4:
                    i = i-1;
                    break;
            }
        }

    }
}
