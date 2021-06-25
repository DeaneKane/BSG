
package fixtures;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Api {

    @SerializedName("results")
    @Expose
    private int results;
    @SerializedName("fixtures")
    @Expose
    private List<Fixture> fixtures = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Api() {
    }

    /**
     * 
     * @param fixtures
     * @param results
     */
    public Api(int results, List<Fixture> fixtures) {
        super();
        this.results = results;
        this.fixtures = fixtures;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<Fixture> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<Fixture> fixtures) {
        this.fixtures = fixtures;
    }

}
