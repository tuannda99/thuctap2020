package tuan1.day3.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TeacherTest {


    public static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void menu(){
        System.out.println("1- Nhập vào n giảng viên: ");
        System.out.println("2- Hiển thị tất cả các giảng viên: ");
        System.out.println("3- Hiển thị giảng viên có lương cao nhất: ");
        System.out.println("4- Thoát");
    }

    public static void fun1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n số giảng viên: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            Teacher teacher = new Teacher();
            teacher.inputInfo();
            System.out.println("---------------");
            teachers.add(teacher);
        }
    }

    public static void fun2(){
        for(Teacher teacher : teachers){
            teacher.showInfo();
        }

    }

    public static void fun3(){
        Comparator<Teacher> comparator = new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o2.getLuong() - o1.getLuong();
            }
        };
        Collections.sort(teachers,comparator);
        System.out.println("Giảng viên có lương cao nhất: ");
        teachers.get(0).showInfo();
    }

    public static void luaChon(){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (i > 0){
            System.out.println("----------------------");
            menu();
            System.out.println("Nhập số lựa chọn");
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

    public static void main(String[] args) {
        luaChon();
    }
}
