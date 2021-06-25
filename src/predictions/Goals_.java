
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goals_ {

    @SerializedName("goalsFor")
    @Expose
    private GoalsFor___ goalsFor;
    @SerializedName("goalsAgainst")
    @Expose
    private GoalsAgainst___ goalsAgainst;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Goals_() {
    }

    /**
     * 
     * @param goalsFor
     * @param goalsAgainst
     */
    public Goals_(GoalsFor___ goalsFor, GoalsAgainst___ goalsAgainst) {
        super();
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public GoalsFor___ getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(GoalsFor___ goalsFor) {
        this.goalsFor = goalsFor;
    }

    public GoalsAgainst___ getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(GoalsAgainst___ goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

}
