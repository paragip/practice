public class Practice {
    public static void main(String[] args) {

        calculateScore(false, 10000, 8, 200);

        calculateScore(true, 15000, 10, 200);


    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            System.out.println("final score = " + finalScore);
        } else {
            System.out.println("the game has not ended");
        }
    }
}
