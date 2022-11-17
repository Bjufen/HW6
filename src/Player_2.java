import java.util.Scanner;

public class Player_2 extends Player{
    @Override
    public int play() {
        int number = bet.pick_card();
        Scanner scanner = new Scanner(System.in);
        boolean selected = false;
        for (int i = 0; i < 5; i++){
            System.out.println("Your card is: " + number + ". Would you like to pick again? Yes: 1, No: 0");
            if(scanner.nextInt() == 1)
                number = bet.pick_card();
            else break;
        }
        setNumber(number);
        return number;
    }
}
