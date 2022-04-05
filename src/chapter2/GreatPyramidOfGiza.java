package chapter2;//Great Pyramid Of Giza

public class GreatPyramidOfGiza{
	public static void main(String[] args){

	double stoneNumbers = 2300000.0;
	double noOfYears = 23.0;
        double stoneSize = 2.5; //size in tonnes
 
	double totalStoneSize = stoneNumbers * stoneSize;

        double oneYearWeight = totalStoneSize/noOfYears; //weight of pyramid per year
	double oneHourWeight = oneYearWeight/(365 * 24); //weight of pyramid  per hour
	double oneMinuteWeight = oneHourWeight/60; //weight of pyramid  per minute

	System.out.printf("Estimated weight of the pyramid based on the number of stones used per year is %f%s%n ",oneYearWeight,"tonnes");
	System.out.printf("Estimated weight of the pyramid based on the number of stones used per hour is %f%s%n ",oneHourWeight,"tonnes");
	System.out.printf("Estimated weight of the pyramid based on the number of stones used per minute is %f%s%n ",oneMinuteWeight,"tonnes");
}
}

	
	

	
	