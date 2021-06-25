
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllLastMatches {

    @SerializedName("matchs")
    @Expose
    private Matchs matchs;
    @SerializedName("goalsAvg")
    @Expose
    private GoalsAvg goalsAvg;
    @SerializedName("goals")
    @Expose
    private Goals goals;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllLastMatches() {
    }

    /**
     * 
     * @param goals
     * @param goalsAvg
     * @param matchs
     */
    public AllLastMatches(Matchs matchs, GoalsAvg goalsAvg, Goals goals) {
        super();
        this.matchs = matchs;
        this.goalsAvg = goalsAvg;
        this.goals = goals;
    }

    public Matchs getMatchs() {
        return matchs;
    }

    public void setMatchs(Matchs matchs) {
        this.matchs = matchs;
    }

    public GoalsAvg getGoalsAvg() {
        return goalsAvg;
    }

    public void setGoalsAvg(GoalsAvg goalsAvg) {
        this.goalsAvg = goalsAvg;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }

}
