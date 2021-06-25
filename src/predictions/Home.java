
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Home {

    @SerializedName("all_last_matches")
    @Expose
    private AllLastMatches_ allLastMatches;
    @SerializedName("team_id")
    @Expose
    private int teamId;
    @SerializedName("last_h2h")
    @Expose
    private LastH2h_ lastH2h;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("last_5_matches")
    @Expose
    private Last5Matches_ last5Matches;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Home() {
    }

    /**
     * 
     * @param teamName
     * @param allLastMatches
     * @param last5Matches
     * @param lastH2h
     * @param teamId
     */
    public Home(AllLastMatches_ allLastMatches, int teamId, LastH2h_ lastH2h, String teamName, Last5Matches_ last5Matches) {
        super();
        this.allLastMatches = allLastMatches;
        this.teamId = teamId;
        this.lastH2h = lastH2h;
        this.teamName = teamName;
        this.last5Matches = last5Matches;
    }

    public AllLastMatches_ getAllLastMatches() {
        return allLastMatches;
    }

    public void setAllLastMatches(AllLastMatches_ allLastMatches) {
        this.allLastMatches = allLastMatches;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public LastH2h_ getLastH2h() {
        return lastH2h;
    }

    public void setLastH2h(LastH2h_ lastH2h) {
        this.lastH2h = lastH2h;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Last5Matches_ getLast5Matches() {
        return last5Matches;
    }

    public void setLast5Matches(Last5Matches_ last5Matches) {
        this.last5Matches = last5Matches;
    }

}
