
package fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Score {

    @SerializedName("halftime")
    @Expose
    private String halftime;
    @SerializedName("fulltime")
    @Expose
    private String fulltime;
    @SerializedName("extratime")
    @Expose
    private Object extratime;
    @SerializedName("penalty")
    @Expose
    private Object penalty;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Score() {
    }

    /**
     * 
     * @param extratime
     * @param halftime
     * @param fulltime
     * @param penalty
     */
    public Score(String halftime, String fulltime, Object extratime, Object penalty) {
        super();
        this.halftime = halftime;
        this.fulltime = fulltime;
        this.extratime = extratime;
        this.penalty = penalty;
    }

    public String getHalftime() {
        return halftime;
    }

    public void setHalftime(String halftime) {
        this.halftime = halftime;
    }

    public String getFulltime() {
        return fulltime;
    }

    public void setFulltime(String fulltime) {
        this.fulltime = fulltime;
    }

    public Object getExtratime() {
        return extratime;
    }

    public void setExtratime(Object extratime) {
        this.extratime = extratime;
    }

    public Object getPenalty() {
        return penalty;
    }

    public void setPenalty(Object penalty) {
        this.penalty = penalty;
    }

}
