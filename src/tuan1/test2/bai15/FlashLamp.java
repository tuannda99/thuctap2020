package tuan1.test2.bai15;

public class FlashLamp {
    private boolean status;

    public Pin pin = new Pin();

    public void FlashLamp(){
        this.status = false;
        pin.setEnergy(0);
    }

    public void setBattery(Pin b){
        pin.setEnergy(b.getEnergy());
    }

    public int getBatteryInfo(){
        return pin.getEnergy();
    }

    public void turnOn(){
        if(this.status = true && pin.getEnergy() > 0){
            System.out.println("ON");
        }
    }

    public void turnOff(){
        if(this.status == false)  System.out.println("Off");
    }



}
