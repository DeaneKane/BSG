
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Def {

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
    public Def() {
    }

    /**
     * 
     * @param home
     * @param away
     */
    public Def(String away, String home) {
        super();
        this.away = away;
        this.home = home;
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
