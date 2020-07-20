package tuan1.day3.bai1;

import java.util.*;

public class StudentTest {

    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Student> studentsHocBong = new ArrayList<>();



    public static void menu(){
        System.out.println("1- Nhập vào n sinh viên");
        System.out.println("2- Hiển thị thông tin sinh viên");
        System.out.println("3- Hiển thị sinh viên có điểm trung bình cao nhất và thấp nhất");
        System.out.println("4- Tìm kiếm thông tin theo mã sinh viên");
        System.out.println("5- Hiện thị sinh viên theo bảng chữ cái");
        System.out.println("6- Hiển thị sinh viên có học bổng và sắp xếp điểm từ cao tớ thấp");
        System.out.println("7- Thoát");
    }

    public static void fun1(){
        System.out.println("Nhập vào n sinh viên");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            Student student = new Student();
            student.inputInfo();
            System.out.println("---------------");
            students.add(student);
        }
    }

    public static void fun2(){
        for(Student student : students){
            student.showInfo();
        }
    }

    public static void fun3(){
        Comparator<Student> comparator = (s1,s2) -> (int) (s2.getDiemTB() - s1.getDiemTB());
        Collections.sort(students,comparator);
        System.out.println("Sinh viên có điểm trung bình cao nhất");
        students.get(0).showInfo();
        System.out.println("Sinh viên có điểm trung bình thấp nhất");
        students.get(students.size()-1).showInfo();

    }

    public static void fun4(){
        System.out.println("Nhập mã sinh viên tìm kiếm");
        String maSV = scan.nextLine();
        int index = 0;
        for(Student student : students){
            if(student.getMaSV().trim().compareTo(maSV.trim()) == 0){
                student.showInfo();
                index = index -1;
            }
        }
        if(students.get(students.size()-1).getMaSV().trim().compareTo(maSV.trim()) == 0 && index == 0){
            System.out.println("Không có sinh viên nào có mã: " + maSV);
        }

    }

    public static void fun5(){
        Comparator<Student> comparator = (s1,s2) -> s1.getTen().compareTo(s2.getTen());
        Collections.sort(students,comparator);
    }

    public static void fun6(){
        for (Student student: students){
            if(student.isHocBong()==true) studentsHocBong.add(student);
        }
        Comparator<Student> comparator = (s1,s2) -> (int) (s2.getDiemTB() - s1.getDiemTB());
        Collections.sort(studentsHocBong,comparator);
        for(Student student : studentsHocBong){
            student.showInfo();
        }


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
                    fun4();
                    break;
                case 5:
                    fun5();
                    fun2();
                    break;
                case 6:
                    fun6();
                    break;
                case 7:
                    i = i-1;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        luaChon();
    }
}
