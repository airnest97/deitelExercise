package chapter4;

public class worldPopulationGrowth {
    public static void main(String[] args) {
        double population = 7953952567.0;
        double growthRate = 0.01;
        double populationDuplicate =1;
        System.out.printf("Year     Anticipated_Pop   Yearly_Population_Increment%n");
        for (int i =1; i<=75;i++){
            for(int j = 1;j<=1; j++){
            System.out.print(" "+i+"        ");}
            for(int j = 1;j<=1; j++){
                populationDuplicate = population;
                population = ((population * growthRate)+population);
                System.out.printf("%.2f      ",population);}
            for(int l = 1; l<=1;l++){
                double populationDifference = population - populationDuplicate;
                System.out.printf("%.2f%n",populationDifference);
            }
            System.out.println();
            }
        }
    }

