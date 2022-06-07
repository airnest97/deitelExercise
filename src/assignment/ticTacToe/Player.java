package assignment.ticTacToe;

import java.util.Objects;

public final class Player {
    private final Cell player;

    public Player(Cell player) {
        this.player = player;
    }

    public Cell player() {
        return player;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Player) obj;
        return Objects.equals(this.player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player);
    }

    @Override
    public String toString() {
        return "Player[" +
                "player=" + player + ']';
    }

}
