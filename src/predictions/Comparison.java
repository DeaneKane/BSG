
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comparison {

    @SerializedName("forme")
    @Expose
    private Forme forme;
    @SerializedName("att")
    @Expose
    private Att att;
    @SerializedName("fish_law")
    @Expose
    private FishLaw fishLaw;
    @SerializedName("def")
    @Expose
    private Def def;
    @SerializedName("goals_h2h")
    @Expose
    private GoalsH2h goalsH2h;
    @SerializedName("h2h")
    @Expose
    private H2h h2h;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Comparison() {
    }

    /**
     * 
     * @param forme
     * @param goalsH2h
     * @param h2h
     * @param def
     * @param fishLaw
     * @param att
     */
    public Comparison(Forme forme, Att att, FishLaw fishLaw, Def def, GoalsH2h goalsH2h, H2h h2h) {
        super();
        this.forme = forme;
        this.att = att;
        this.fishLaw = fishLaw;
        this.def = def;
        this.goalsH2h = goalsH2h;
        this.h2h = h2h;
    }

    public Forme getForme() {
        return forme;
    }

    public void setForme(Forme forme) {
        this.forme = forme;
    }

    public Att getAtt() {
        return att;
    }

    public void setAtt(Att att) {
        this.att = att;
    }

    public FishLaw getFishLaw() {
        return fishLaw;
    }

    public void setFishLaw(FishLaw fishLaw) {
        this.fishLaw = fishLaw;
    }

    public Def getDef() {
        return def;
    }

    public void setDef(Def def) {
        this.def = def;
    }

    public GoalsH2h getGoalsH2h() {
        return goalsH2h;
    }

    public void setGoalsH2h(GoalsH2h goalsH2h) {
        this.goalsH2h = goalsH2h;
    }

    public H2h getH2h() {
        return h2h;
    }

    public void setH2h(H2h h2h) {
        this.h2h = h2h;
    }

}
