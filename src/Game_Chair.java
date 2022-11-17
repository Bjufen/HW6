public class Game_Chair {

    private Player computer, p2;
    BetMore_Game bet;
    private int c, p_2;

    public Game_Chair() {
        bet = new BetMore_Game();
        computer = new Player();
        p2 = new Player_2();
    }

    public void Start(Player p){
        if (p instanceof Player_2)
           p_2 = p.play();
        else c = p.play();
    }
    public void FindWinner(){
        Player winner = bet.findWinner(computer, p2);
        if( winner == computer)
            System.out.println("THE COMPUTER WINS!!!!");
        else
            System.out.println("THE PLAYER WINS!!!!");
        System.out.println("Computer: " + c + "\nPlayer: " + p_2);
    }

    public final void run(){
        Start(computer);
        Start(p2);
        FindWinner();
    }
}
