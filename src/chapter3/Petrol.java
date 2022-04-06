package chapter3;


import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetrolPurchase customer1 = new PetrolPurchase("Abuja", "High Quality", 10, 135.23, 2.1);

        System.out.printf("The net-amount for a %s petrol-type purchased in %s with a discount of %.2f for %dlitres and %.2fperlitre is %.2fnaira %n"
                , customer1.getTypeOfPetrol(), customer1.getLocation(), customer1.getPercentageDiscount(),
                customer1.getQuantity(), customer1.getPricePerLiter(), customer1.getPurchaseAmount());
        System.out.println("Enter the location ");
        String location = input.nextLine();
        customer1.setLocation(location);

        System.out.println("Enter the type of petrol");
        String petrolType = input.nextLine();
        customer1.setTypeOfPetrol(petrolType);

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();
        customer1.setQuantity(quantity);

        System.out.println("Enter the pricePerLitre");
        double pricePerLitre = input.nextDouble();
        customer1.setPricePerLiter(pricePerLitre);

        System.out.println("Enter the percentage discount");
        double percentageDiscount = input.nextDouble();
        customer1.setPercentageDiscount(percentageDiscount);


        System.out.printf("The net-amount for a %s petrol-type purchased in %s with a discount of %.2f for %dlitres and %.2fperlitre is %.2fnaira %n"
                , customer1.getTypeOfPetrol(), customer1.getLocation(), customer1.getPercentageDiscount(),
                customer1.getQuantity(), customer1.getPricePerLiter(), customer1.getPurchaseAmount());
    }
}
