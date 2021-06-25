
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllLastMatches_ {

    @SerializedName("matchs")
    @Expose
    private Matchs_ matchs;
    @SerializedName("goalsAvg")
    @Expose
    private GoalsAvg_ goalsAvg;
    @SerializedName("goals")
    @Expose
    private Goals_ goals;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllLastMatches_() {
    }

    /**
     * 
     * @param goals
     * @param goalsAvg
     * @param matchs
     */
    public AllLastMatches_(Matchs_ matchs, GoalsAvg_ goalsAvg, Goals_ goals) {
        super();
        this.matchs = matchs;
        this.goalsAvg = goalsAvg;
        this.goals = goals;
    }

    public Matchs_ getMatchs() {
        return matchs;
    }

    public void setMatchs(Matchs_ matchs) {
        this.matchs = matchs;
    }

    public GoalsAvg_ getGoalsAvg() {
        return goalsAvg;
    }

    public void setGoalsAvg(GoalsAvg_ goalsAvg) {
        this.goalsAvg = goalsAvg;
    }

    public Goals_ getGoals() {
        return goals;
    }

    public void setGoals(Goals_ goals) {
        this.goals = goals;
    }

}
