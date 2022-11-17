public class Player {

    private int number;

    BetMore_Game bet = new BetMore_Game();
    public int play(){
        return number = bet.pick_card();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
