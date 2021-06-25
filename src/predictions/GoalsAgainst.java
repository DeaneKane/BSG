
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoalsAgainst {

    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("away")
    @Expose
    private String away;
    @SerializedName("home")
    @Expose
    private String home;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GoalsAgainst() {
    }

    /**
     * 
     * @param total
     * @param home
     * @param away
     */
    public GoalsAgainst(String total, String away, String home) {
        super();
        this.total = total;
        this.away = away;
        this.home = home;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

}
