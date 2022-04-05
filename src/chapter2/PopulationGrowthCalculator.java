package chapter2;

//To show the world's current population and the trend for the next five years;
public class PopulationGrowthCalculator {
	public static void main(String[] args) {

		double currentPop = 7953952567.0;
		double growthRate = 0.01;

		double onePop = ((7953952567.0 * growthRate) + 7953952567.0);
		double secondPop = ((onePop * growthRate) + onePop);
		double thirdPop = ((secondPop * growthRate) + secondPop);
		double fourthPop = ((thirdPop * growthRate) + thirdPop);
		double fifthPop = ((fourthPop * growthRate) + fourthPop);

		System.out.println("The current population of the world is " + currentPop);
		System.out.println("The population of the world in a year is projected to be; " + onePop);
		System.out.println("The population of the world in the second year is projected to be; " + secondPop);
		System.out.println("The population of the world in the third year is projected to be; " + thirdPop);
		System.out.println("The population of the world in the fourth year is projected to be; " + fourthPop);
		System.out.println("The population of the world in the fifth year is projected to be; " + fifthPop);
	}
}