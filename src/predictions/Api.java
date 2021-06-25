
package predictions;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Api {

    @SerializedName("results")
    @Expose
    private int results;
    @SerializedName("predictions")
    @Expose
    private List<Prediction> predictions = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Api() {
    }

    /**
     * 
     * @param predictions
     * @param results
     */
    public Api(int results, List<Prediction> predictions) {
        super();
        this.results = results;
        this.predictions = predictions;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<Prediction> getPredictions() {
        return predictions;
    }

    public void setPredictions(List<Prediction> predictions) {
        this.predictions = predictions;
    }

}
