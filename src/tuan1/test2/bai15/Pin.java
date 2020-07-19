package tuan1.test2.bai15;

public class Pin {
    public int energy;

    public Pin(){
        this.energy = 10;
    }

    public void setEnergy(int energy1){
        this.energy = energy1;
    }

    public int getEnergy(){
        return this.energy;
    }

    public void decreaseEnergy(){
        this.energy = this.energy - 2;
    }

}
