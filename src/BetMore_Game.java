public class BetMore_Game {

    Shuffle s = new Shuffle();
    public int pick_card() {
        return s.getRandom();
    }

    //In case the players are tied, the win goes to the computer!
    public Player findWinner(Player system, Player player_2){
        if(system.getNumber() >= player_2.getNumber())
            return system;
        else return player_2;
    }
}
