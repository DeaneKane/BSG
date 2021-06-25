
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Last5Matches {

    @SerializedName("forme")
    @Expose
    private String forme;
    @SerializedName("att")
    @Expose
    private String att;
    @SerializedName("def")
    @Expose
    private String def;
    @SerializedName("goals_against")
    @Expose
    private int goalsAgainst;
    @SerializedName("goals_avg")
    @Expose
    private double goalsAvg;
    @SerializedName("goals_against_avg")
    @Expose
    private double goalsAgainstAvg;
    @SerializedName("goals")
    @Expose
    private int goals;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Last5Matches() {
    }

    /**
     * 
     * @param forme
     * @param goals
     * @param goalsAgainstAvg
     * @param goalsAvg
     * @param def
     * @param att
     * @param goalsAgainst
     */
    public Last5Matches(String forme, String att, String def, int goalsAgainst, double goalsAvg, int goalsAgainstAvg, int goals) {
        super();
        this.forme = forme;
        this.att = att;
        this.def = def;
        this.goalsAgainst = goalsAgainst;
        this.goalsAvg = goalsAvg;
        this.goalsAgainstAvg = goalsAgainstAvg;
        this.goals = goals;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public double getGoalsAvg() {
        return goalsAvg;
    }

    public void setGoalsAvg(double goalsAvg) {
        this.goalsAvg = goalsAvg;
    }

    public double getGoalsAgainstAvg() {
        return goalsAgainstAvg;
    }

    public void setGoalsAgainstAvg(double goalsAgainstAvg) {
        this.goalsAgainstAvg = goalsAgainstAvg;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

}
