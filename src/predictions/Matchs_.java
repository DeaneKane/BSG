
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Matchs_ {

    @SerializedName("wins")
    @Expose
    private Wins__ wins;
    @SerializedName("matchsPlayed")
    @Expose
    private MatchsPlayed_ matchsPlayed;
    @SerializedName("loses")
    @Expose
    private Loses__ loses;
    @SerializedName("draws")
    @Expose
    private Draws__ draws;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Matchs_() {
    }

    /**
     * 
     * @param matchsPlayed
     * @param loses
     * @param draws
     * @param wins
     */
    public Matchs_(Wins__ wins, MatchsPlayed_ matchsPlayed, Loses__ loses, Draws__ draws) {
        super();
        this.wins = wins;
        this.matchsPlayed = matchsPlayed;
        this.loses = loses;
        this.draws = draws;
    }

    public Wins__ getWins() {
        return wins;
    }

    public void setWins(Wins__ wins) {
        this.wins = wins;
    }

    public MatchsPlayed_ getMatchsPlayed() {
        return matchsPlayed;
    }

    public void setMatchsPlayed(MatchsPlayed_ matchsPlayed) {
        this.matchsPlayed = matchsPlayed;
    }

    public Loses__ getLoses() {
        return loses;
    }

    public void setLoses(Loses__ loses) {
        this.loses = loses;
    }

    public Draws__ getDraws() {
        return draws;
    }

    public void setDraws(Draws__ draws) {
        this.draws = draws;
    }

}
