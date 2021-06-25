
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoalsAvg {

    @SerializedName("goalsFor")
    @Expose
    private GoalsFor goalsFor;
    @SerializedName("goalsAgainst")
    @Expose
    private GoalsAgainst goalsAgainst;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GoalsAvg() {
    }

    /**
     * 
     * @param goalsFor
     * @param goalsAgainst
     */
    public GoalsAvg(GoalsFor goalsFor, GoalsAgainst goalsAgainst) {
        super();
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public GoalsFor getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(GoalsFor goalsFor) {
        this.goalsFor = goalsFor;
    }

    public GoalsAgainst getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(GoalsAgainst goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

}
