package tuan1.test2.bai18;

public class Product {

    public String name;
    private String description;
    private double price;
    private int[] rate;
    private double value;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public String toString(){
        return "Name: " + getName() + "\n"
                + "Description: " + getDescription() + "\n"
                + "Price : " + getPrice() + "\n"
                + "Value : " + value + "\n";
    }

    public void viewInfo() {
        int sum = 0;
        for(int i = 0; i < rate.length;i++){
            sum = sum + rate[i];
        }
        this.value = (double)sum / rate.length;
        System.out.println(toString());
    }

}
