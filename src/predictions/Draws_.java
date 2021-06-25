
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Draws_ {

    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("away")
    @Expose
    private int away;
    @SerializedName("home")
    @Expose
    private int home;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Draws_() {
    }

    /**
     * 
     * @param total
     * @param home
     * @param away
     */
    public Draws_(int total, int away, int home) {
        super();
        this.total = total;
        this.away = away;
        this.home = home;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAway() {
        return away;
    }

    public void setAway(int away) {
        this.away = away;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

}
