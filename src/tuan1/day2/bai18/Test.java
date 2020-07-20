package tuan1.day2.bai18;

import java.util.Scanner;

public class Test {

    public static void menu(){
        System.out.println("1- Add new product");
        System.out.println("2- Remove product");
        System.out.println("3- Iterate product list");
        System.out.println("4- Search product");
    }

    public static void option(){
        Scanner scan = new Scanner(System.in);
        Shop shop = new Shop();

        int i = 1;
        while (i > 0){
            System.out.println("----------------------");
            menu();
            System.out.println("Option: ");
            int index = scan.nextInt();
            switch(index) {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.removeProduct();
                    break;
                case 3:
                    shop.iterateProductList();
                    break;
                case 4:
                    shop.searchProduct();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        option();
    }
}
