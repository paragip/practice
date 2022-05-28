public class Practice {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Palcsi", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Terike", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Pistike", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Sanyesz", position);
    }
    public static void displayHighScorePosition(String nameOfPlayers, int position){
        System.out.println(nameOfPlayers + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int scoreOfPlayer){

        if (scoreOfPlayer >= 1000) {
            return 1;
        } else if (scoreOfPlayer >= 500) {
            return 2;
        } else if (scoreOfPlayer >= 100) {
            return 3;
        } else {
            return 4;
        }

    }
}
