
package predictions;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prediction {

    @SerializedName("under_over")
    @Expose
    private String underOver;
    @SerializedName("winning_percent")
    @Expose
    private WinningPercent winningPercent;
    @SerializedName("comparison")
    @Expose
    private Comparison comparison;
    @SerializedName("teams")
    @Expose
    private Teams teams;
    @SerializedName("match_winner")
    @Expose
    private String matchWinner;
    @SerializedName("advice")
    @Expose
    private String advice;
    @SerializedName("goals_home")
    @Expose
    private String goalsHome;
    @SerializedName("goals_away")
    @Expose
    private String goalsAway;
    @SerializedName("h2h")
    @Expose
    private List<H2h_> h2h = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prediction() {
    }

    /**
     * 
     * @param teams
     * @param h2h
     * @param goalsAway
     * @param underOver
     * @param winningPercent
     * @param advice
     * @param matchWinner
     * @param goalsHome
     * @param comparison
     */
    public Prediction(String underOver, WinningPercent winningPercent, Comparison comparison, Teams teams, String matchWinner, String advice, String goalsHome, String goalsAway, List<H2h_> h2h) {
        super();
        this.underOver = underOver;
        this.winningPercent = winningPercent;
        this.comparison = comparison;
        this.teams = teams;
        this.matchWinner = matchWinner;
        this.advice = advice;
        this.goalsHome = goalsHome;
        this.goalsAway = goalsAway;
        this.h2h = h2h;
    }

    public String getUnderOver() {
        return underOver;
    }

    public void setUnderOver(String underOver) {
        this.underOver = underOver;
    }

    public WinningPercent getWinningPercent() {
        return winningPercent;
    }

    public void setWinningPercent(WinningPercent winningPercent) {
        this.winningPercent = winningPercent;
    }

    public Comparison getComparison() {
        return comparison;
    }

    public void setComparison(Comparison comparison) {
        this.comparison = comparison;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public String getMatchWinner() {
        return matchWinner;
    }

    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getGoalsHome() {
        return goalsHome;
    }

    public void setGoalsHome(String goalsHome) {
        this.goalsHome = goalsHome;
    }

    public String getGoalsAway() {
        return goalsAway;
    }

    public void setGoalsAway(String goalsAway) {
        this.goalsAway = goalsAway;
    }

    public List<H2h_> getH2h() {
        return h2h;
    }

    public void setH2h(List<H2h_> h2h) {
        this.h2h = h2h;
    }

}
