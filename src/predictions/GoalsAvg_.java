
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoalsAvg_ {

    @SerializedName("goalsFor")
    @Expose
    private GoalsFor__ goalsFor;
    @SerializedName("goalsAgainst")
    @Expose
    private GoalsAgainst__ goalsAgainst;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GoalsAvg_() {
    }

    /**
     * 
     * @param goalsFor
     * @param goalsAgainst
     */
    public GoalsAvg_(GoalsFor__ goalsFor, GoalsAgainst__ goalsAgainst) {
        super();
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public GoalsFor__ getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(GoalsFor__ goalsFor) {
        this.goalsFor = goalsFor;
    }

    public GoalsAgainst__ getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(GoalsAgainst__ goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

}
