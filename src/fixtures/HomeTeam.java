
package fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HomeTeam {

    @SerializedName("team_id")
    @Expose
    private int teamId;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("logo")
    @Expose
    private String logo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HomeTeam() {
    }

    /**
     * 
     * @param teamName
     * @param logo
     * @param teamId
     */
    public HomeTeam(int teamId, String teamName, String logo) {
        super();
        this.teamId = teamId;
        this.teamName = teamName;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
