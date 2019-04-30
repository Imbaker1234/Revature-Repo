public class
MethodOverloading {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        int[] scores = {1500, 900, 400, 50};
        String[] names = {"John", "Gary", "Louise", "Fred"};

        for (int i = 0; i < scores.length; i++) {
            calcAndDisplay(names[i], scores[i]);
        }

    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " made it into position " + position + '!');
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if ((score >= 1000)) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
        public static void calcAndDisplay(String name, int score) {
            displayHighScorePosition(name, calculateHighScorePosition(score));
    }

}


