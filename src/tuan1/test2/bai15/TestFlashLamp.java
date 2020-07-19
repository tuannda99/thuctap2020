package tuan1.test2.bai15;

public class TestFlashLamp {
    public static void main(String[] args) {
        Pin pin = new Pin();
        FlashLamp flamp = new FlashLamp();
        flamp.setBattery(pin);
        for(int i = 0; i < 10; i++){
            System.out.println("Năng lượng pin: "+ pin.getEnergy());
            flamp.turnOn();
            pin.decreaseEnergy();
            flamp.setBattery(pin);
            flamp.turnOff();
        }
    }
}
