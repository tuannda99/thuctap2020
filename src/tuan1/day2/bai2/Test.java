package tuan1.day2.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void menu(){
        System.out.println("1- Nhập thông tin Student");
        System.out.println("2- In thông tin Student");
        System.out.println("3- Thoát");
    }

    public static void luaChon(){
        ArrayList<Student> student = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int i = 1;
        while (i > 0){
            System.out.println("----------------------");
            menu();
            System.out.println("Nhập số lựa chọn");
            int index = scan.nextInt();
            switch(index) {
                case 1:
                    Student std = new Student();
                    std.inputInfo();
                    student.add(std);
                    break;
                case 2:
                    for(int k = 0; k < student.size(); k++){
                        student.get(k).showInfo();
                    }
                    break;
                case 3:
                    i = i-1;
                    break;
            }
        }
    }

    public static void main(String[] args) {
       luaChon();
    }
}
