
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastH2h {

    @SerializedName("wins")
    @Expose
    private Wins_ wins;
    @SerializedName("loses")
    @Expose
    private Loses_ loses;
    @SerializedName("draws")
    @Expose
    private Draws_ draws;
    @SerializedName("played")
    @Expose
    private Played played;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LastH2h() {
    }

    /**
     * 
     * @param loses
     * @param played
     * @param draws
     * @param wins
     */
    public LastH2h(Wins_ wins, Loses_ loses, Draws_ draws, Played played) {
        super();
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        this.played = played;
    }

    public Wins_ getWins() {
        return wins;
    }

    public void setWins(Wins_ wins) {
        this.wins = wins;
    }

    public Loses_ getLoses() {
        return loses;
    }

    public void setLoses(Loses_ loses) {
        this.loses = loses;
    }

    public Draws_ getDraws() {
        return draws;
    }

    public void setDraws(Draws_ draws) {
        this.draws = draws;
    }

    public Played getPlayed() {
        return played;
    }

    public void setPlayed(Played played) {
        this.played = played;
    }

}
