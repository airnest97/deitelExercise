package chapter3;

public class PetrolPurchase {
    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String location,String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount) {
        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        if (quantity > 0) {
            this.quantity = quantity;
        }
        if (pricePerLiter > 0) {
            this.pricePerLiter = pricePerLiter;
        }
        this.percentageDiscount = percentageDiscount;

    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return  quantity;
    }
    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }
    public double getPricePerLiter(){
        return pricePerLiter;
    }

    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public double getPurchaseAmount(){
        return (quantity * pricePerLiter) - percentageDiscount;
    }

}

