import java.util.Scanner;

public class Simulator {

    public static void main(String[] args) {

        mazeGenerate();
    }

    public static void mazeGenerate() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Maze" + "\n\n" + "Select your difficulty" + "\n" + "1. Easy\n" + "2. Medium\n" + "3. Hard");
            int difficulty = in.nextInt();

            if (difficulty == 1) {
                System.out.println("You are a wimpy person");
                Maze easyMaze = new Maze(10, 1, 9, 1, 9);
            } else if (difficulty == 2) {
                System.out.println("You have picked the medium difficulty");
                break;
            } else if (difficulty == 3) {
                System.out.println("You have dared to try the SPICY difficulty.");
            } else {
                System.out.println("Invalid entry. Entry must be between 1 and 3");
                //System.exit(-1);
            }

        }
        System.out.println("IT'S ALIIIIIIVE!!!");
    }
    }


//   0     2 2 2 2 2 2 2 2 2 2
//   1     1 0 0 0 0 0 0 0 0 1
//   2     1 0 0 0 0 0 0 0 0 1
//   3     1 0 0 0 0 0 0 0 0 1
//   4     1 0 0 0 0 0 0 0 0 1
//   5     1 0 0 0 0 0 0 0 0 1
//   6     1 0 0 0 0 0 0 0 0 1
//   7     1 0 0 0 0 0 0 0 0 1
//   8     1 0 0 0 0 0 0 0 0 1
//   9     1 0 0 0 0 0 0 0 0 1
//  10     2 2 2 2 2 2 2 2 2 2

//         0 1 2 3 4 5 6 7 8 9 10