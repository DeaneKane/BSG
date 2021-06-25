
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goals {

    @SerializedName("goalsFor")
    @Expose
    private GoalsFor_ goalsFor;
    @SerializedName("goalsAgainst")
    @Expose
    private GoalsAgainst_ goalsAgainst;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Goals() {
    }

    /**
     * 
     * @param goalsFor
     * @param goalsAgainst
     */
    public Goals(GoalsFor_ goalsFor, GoalsAgainst_ goalsAgainst) {
        super();
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public GoalsFor_ getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(GoalsFor_ goalsFor) {
        this.goalsFor = goalsFor;
    }

    public GoalsAgainst_ getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(GoalsAgainst_ goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

}
