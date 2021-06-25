
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoalsAgainst___ {

    @SerializedName("total")
    @Expose
    private double total;
    @SerializedName("away")
    @Expose
    private double away;
    @SerializedName("home")
    @Expose
    private double home;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GoalsAgainst___() {
    }

    /**
     * 
     * @param total
     * @param home
     * @param away
     */
    public GoalsAgainst___(double total, double away, double home) {
        super();
        this.total = total;
        this.away = away;
        this.home = home;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAway() {
        return away;
    }

    public void setAway(double away) {
        this.away = away;
    }

    public double getHome() {
        return home;
    }

    public void setHome(double home) {
        this.home = home;
    }

}
