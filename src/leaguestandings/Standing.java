
package leaguestandings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standing {

    @SerializedName("teamName")
    @Expose
    private String teamName;
    @SerializedName("all")
    @Expose
    private All all;
    @SerializedName("away")
    @Expose
    private Away away;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("team_id")
    @Expose
    private int teamId;
    @SerializedName("goalsDiff")
    @Expose
    private int goalsDiff;
    @SerializedName("home")
    @Expose
    private Home home;
    @SerializedName("points")
    @Expose
    private int points;
    @SerializedName("forme")
    @Expose
    private String forme;
    @SerializedName("lastUpdate")
    @Expose
    private String lastUpdate;
    @SerializedName("rank")
    @Expose
    private int rank;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("group")
    @Expose
    private String group;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public All getAll() {
        return all;
    }

    public void setAll(All all) {
        this.all = all;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getGoalsDiff() {
        return goalsDiff;
    }

    public void setGoalsDiff(int goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}
