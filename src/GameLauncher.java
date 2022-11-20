import java.util.Scanner;

public class GameLauncher {

    public static void main(String[] args) {
        Game_Chair game_chair = new Game_Chair();
        boolean over = false;
        Scanner scanner = new Scanner(System.in);
        while(!over) {
            game_chair.run();
            System.out.println("Would you like to play again? y/n");
            if(!scanner.next().equals("y"))
                over = true;
        }
    }
}
