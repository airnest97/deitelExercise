package chapter3;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0) {
            this.price = price;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    public double getPrice(){
    return price;}


    public double getFivePercent(){
    return price * 0.05  + price;}


    public double getSevenPercent(){
        return price * 0.07  + price;}
}

