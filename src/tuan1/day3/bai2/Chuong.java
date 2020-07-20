package tuan1.day3.bai2;

import java.util.ArrayList;

public class Chuong {

    private int maChuong;
    public ArrayList<Animal> animalArrayList = new ArrayList<>();

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public void themConVat(Animal a){
        animalArrayList.add(a);
    }

    public void xoaConVat(String ten){
        for(int i = 0; i < animalArrayList.size(); i++){
            if(animalArrayList.get(i).getTen().trim().equals(ten.trim()) == true){
                animalArrayList.remove(i);
            }
        }
    }

    public void inThongTinChuong() {
        System.out.println("Chuồng: " + maChuong);
        for(Animal animal : animalArrayList){
            System.out.println(animal.toString());
        }
    }
}
