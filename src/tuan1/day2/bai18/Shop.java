package tuan1.day2.bai18;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<Integer> danhGia = new ArrayList();
    private Scanner scan;

    public void addProduct(){
        scan = new Scanner(System.in);
        Product prod = new Product();

        System.out.println("Nhập tên sản phẩm");
        String name = scan.nextLine();
        prod.setName(name);

        System.out.println("Nhập mô tả");
        String description= scan.nextLine();
        prod.setDescription(description);

        System.out.println("Nhập giá sản phẩm");
        double price = Double.parseDouble(scan.nextLine());
        prod.setPrice(price);

        System.out.println("Nhập các đánh giá (Gía trị từ 1 -> 5, kết thúc bằng số 0");
        int index = 1;

        while(index == 1){
            int k = scan.nextInt();
            if(k == 0) {
                index = index - 1;
                break;
            }else danhGia.add(k);
        }

        int n = danhGia.size();
        int[] rate = new int[n];
        for (int i = 0; i < n; i++) {
            rate[i] = (int) danhGia.get(i);
        }
        prod.setRate(rate);
        productList.add(prod);

    }

    public void removeProduct(){
        System.out.println("Nhập tên sản phẩm cần xóa: ");
        scan = new Scanner(System.in);
        String moveTu = scan.nextLine();

        for(int i = 0; i < productList.size();i++){
            if(moveTu.trim().equals(productList.get(i).getName().trim())){
                productList.remove(i);
            }
        }
    }

    public void iterateProductList(){
        for(Product pList: productList){
            pList.viewInfo();
        }
    }

    public void searchProduct(){
        scan = new Scanner(System.in);
        System.out.println("Nhập giá trị min: ");
        int min = scan.nextInt();
        System.out.println("Nhập giá trị max: ");
        int max = scan.nextInt();
        for(Product product : productList){
            if(product.getPrice() >= min && product.getPrice() <= max){
                product.viewInfo();
            }
        }
    }
}
