public class Maze {
    int mazeWidth; int mazeHeight;
    int playerPosX; int playerPosY;
    int exitPosX; int exitPosY;

    Maze(){
        super();
    }

    public Maze(int mazeSize, int playerPosX, int playerPosY, int exitPosX, int exitPosY) {
        this.mazeWidth = mazeSize;
        this.mazeHeight = mazeSize;
        this.playerPosX = playerPosX;
        this.playerPosY = playerPosY;
        this.exitPosX = exitPosX;
        this.exitPosY = exitPosY;
    }

//    public static void printMaze() {
//        char[]
//    }
    // While playerXY != exitXY! continue playing

    //Switch used to navigate. If playerMove == left then go left. Etc.

    //If player makes invalid move then don't change playerPosX or playerPosY

    //do while if the direction dictated in the switch is valid continue moving until you hit wall

    //for will be used to generate the map.



}
