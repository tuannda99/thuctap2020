package tuan1.day3.bai2;

import java.util.ArrayList;

public class Zoo {

    public ArrayList<Chuong> chuongArrayList = new ArrayList<>();

    public void themChuong(Chuong c){
        chuongArrayList.add(c);
    }

    public void xoaChuong(int maChuong){
        for(int i = 0; i < chuongArrayList.size(); i++){
            if(chuongArrayList.get(i).getMaChuong() == maChuong){
                chuongArrayList.remove(i);
            }
        }
    }
}
