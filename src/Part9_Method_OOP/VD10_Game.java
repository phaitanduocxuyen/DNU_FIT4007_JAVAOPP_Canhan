package src.Part9_Method_OOP;

public class VD10_Game {
    private int id;
    private VD9_Player player1;
    private VD9_Player player2;

    public VD10_Game() {}

    public VD10_Game(int id, VD9_Player player1, VD9_Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public VD9_Player getPlayer1() { return player1; }
    public void setPlayer1(VD9_Player player1) { this.player1 = player1; }

    public VD9_Player getPlayer2() { return player2; }
    public void setPlayer2(VD9_Player player2) { this.player2 = player2; }

    public VD9_Player getWinner() {
        if (player1.isWinner() && player2.isWinner()) return player1;
        if (player1.isWinner()) return player1;
        if (player2.isWinner()) return player2;
        return null;
    }

    public void resetGame() {
        player1.setScore(0);
        player2.setScore(0);
    }

    public void swapPlayers() {
        VD9_Player temp = player1;
        player1 = player2;
        player2 = temp;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }
}
