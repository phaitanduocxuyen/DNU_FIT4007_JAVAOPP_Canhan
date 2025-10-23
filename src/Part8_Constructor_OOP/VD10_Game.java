package src.Part8_Constructor_OOP;

public class VD10_Game {
    private int id;
    private VD9_Player player1;
    private VD9_Player player2;

    public VD10_Game() {
    }

    public VD10_Game(int id, VD9_Player player1, VD9_Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VD9_Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(VD9_Player player1) {
        this.player1 = player1;
    }

    public VD9_Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(VD9_Player player2) {
        this.player2 = player2;
    }

    @Override
    public String toString() {
        return "VD10_Game{" +
                "id=" + id +
                ", player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }
}
