
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Teams {

    @SerializedName("away")
    @Expose
    private Away away;
    @SerializedName("home")
    @Expose
    private Home home;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Teams() {
    }

    /**
     * 
     * @param home
     * @param away
     */
    public Teams(Away away, Home home) {
        super();
        this.away = away;
        this.home = home;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

}
