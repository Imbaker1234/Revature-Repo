//package BuchalkaChallenge;
//
//public class Challenge {
//
// ==============CHALLENGE 1====================
//    public static void main(String[] args) {
//        double var1 = 20.00;
//        double var2 = 80.00;
//        double result = (var1 + var2) * 25;
//        double remainder = result % 40;
//
//        if (remainder <= 20) {
//            System.out.println("Total was over the limit");
//            System.out.println(remainder);
//        }
//    }
//
//
// ================CHALLENGE 2==================
//
//    These are examples of expressions
//
//     score =100
//     score > 99
//     "You got the high score!"
//     score = 0
//
// ================CHALLENGE 3==================
//public static void main(String[] args) {
//
//    boolean gameOver = true;
//
//    if (gameOver) {
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        int finalScore = score + (levelCompleted * bonus);
//        System.out.println(finalScore);
//    }
//
//    if (gameOver) {
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//        int finalScore = score + (levelCompleted * bonus);
//        System.out.println(finalScore);
//    }
//}
//
//    public static void main(String[] args) {
//
//        int highScore= calculateScore(true, 20000, 4, 20);
//        System.out.println("Your final score was" + highScore);
//    }
//
//    private static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
//            if (gameOver) {
//                int finalScore = score + (levelCompleted * bonus);
//                finalScore += 1000;
//                return finalScore;
//            }
//                return -1;
//        }
//    }
// ================CHALLENG
//
//    public static void main(String[] args) {
//        int highScorePosition = calculateHighScorePosition(1500);
//        displayHighScorePosition("Ian", highScorePosition);
//        highScorePosition = calculateHighScorePosition(900);
//        displayHighScorePosition("Ashlee", highScorePosition);
//        highScorePosition = calculateHighScorePosition(400);
//        displayHighScorePosition("Baby Noah", highScorePosition);
//        highScorePosition = calculateHighScorePosition(50);
//        displayHighScorePosition("McKenzie", highScorePosition);
//    }
//
//    private static void displayHighScorePosition(String playersName, int ranking) {
//        System.out.println(playersName + " has attained rank #" + ranking);
//    }
//
//    private static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
//    }
//        int position = 4; // assuming position 4 will be return
//
//        if (playerScore >= 1000) {
//            position = 1;
//        } else if (playerScore >= 500) {
//            position = 2;
//        } else if (playerScore >= 100) {
//            position = 3;
//        }
//    }
//}
//}