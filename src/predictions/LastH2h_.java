
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastH2h_ {

    @SerializedName("wins")
    @Expose
    private Wins___ wins;
    @SerializedName("loses")
    @Expose
    private Loses___ loses;
    @SerializedName("draws")
    @Expose
    private Draws___ draws;
    @SerializedName("played")
    @Expose
    private Played_ played;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LastH2h_() {
    }

    /**
     * 
     * @param loses
     * @param played
     * @param draws
     * @param wins
     */
    public LastH2h_(Wins___ wins, Loses___ loses, Draws___ draws, Played_ played) {
        super();
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        this.played = played;
    }

    public Wins___ getWins() {
        return wins;
    }

    public void setWins(Wins___ wins) {
        this.wins = wins;
    }

    public Loses___ getLoses() {
        return loses;
    }

    public void setLoses(Loses___ loses) {
        this.loses = loses;
    }

    public Draws___ getDraws() {
        return draws;
    }

    public void setDraws(Draws___ draws) {
        this.draws = draws;
    }

    public Played_ getPlayed() {
        return played;
    }

    public void setPlayed(Played_ played) {
        this.played = played;
    }

}
