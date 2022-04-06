package tddClass;


public class DiceGame {
    private String status;
    private int sum;
    private int point;

    public void rollDice(int die1, int die2) {

        sum = die1 + die2;
        if (sum == 7 || sum == 11)
            status = "You Win";
        else if (sum == 2 || sum == 3 || sum == 12)
            status = "You Lose";
        else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
            status = "Please try again";
        point = sum;
        initialPointWins(die1, die2);
    }

    public String getStatus() {
        return status;
    }

    public int getPoint() {
        return point;
    }

    public void initialPointWins(int die1, int die2) {
        for (int i = 1; i != 0; i++) {

            sum = die1 + die2;
            if(sum == 7){
                status = "You Lose";
                break;
            }
            else if (sum == point){
                status = "You Win";
                break;
            }
        }
    }
}
