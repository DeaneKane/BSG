
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AwayTeam {

    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("team_id")
    @Expose
    private int teamId;
    @SerializedName("team_name")
    @Expose
    private String teamName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AwayTeam() {
    }

    /**
     * 
     * @param teamName
     * @param logo
     * @param teamId
     */
    public AwayTeam(String logo, int teamId, String teamName) {
        super();
        this.logo = logo;
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
