
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Matchs {

    @SerializedName("wins")
    @Expose
    private Wins wins;
    @SerializedName("matchsPlayed")
    @Expose
    private MatchsPlayed matchsPlayed;
    @SerializedName("loses")
    @Expose
    private Loses loses;
    @SerializedName("draws")
    @Expose
    private Draws draws;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Matchs() {
    }

    /**
     * 
     * @param matchsPlayed
     * @param loses
     * @param draws
     * @param wins
     */
    public Matchs(Wins wins, MatchsPlayed matchsPlayed, Loses loses, Draws draws) {
        super();
        this.wins = wins;
        this.matchsPlayed = matchsPlayed;
        this.loses = loses;
        this.draws = draws;
    }

    public Wins getWins() {
        return wins;
    }

    public void setWins(Wins wins) {
        this.wins = wins;
    }

    public MatchsPlayed getMatchsPlayed() {
        return matchsPlayed;
    }

    public void setMatchsPlayed(MatchsPlayed matchsPlayed) {
        this.matchsPlayed = matchsPlayed;
    }

    public Loses getLoses() {
        return loses;
    }

    public void setLoses(Loses loses) {
        this.loses = loses;
    }

    public Draws getDraws() {
        return draws;
    }

    public void setDraws(Draws draws) {
        this.draws = draws;
    }

}
