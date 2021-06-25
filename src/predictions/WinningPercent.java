
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WinningPercent {

    @SerializedName("away")
    @Expose
    private String away;
    @SerializedName("draws")
    @Expose
    private String draws;
    @SerializedName("home")
    @Expose
    private String home;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WinningPercent() {
    }

    /**
     * 
     * @param home
     * @param away
     * @param draws
     */
    public WinningPercent(String away, String draws, String home) {
        super();
        this.away = away;
        this.draws = draws;
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getDraws() {
        return draws;
    }

    public void setDraws(String draws) {
        this.draws = draws;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

}
