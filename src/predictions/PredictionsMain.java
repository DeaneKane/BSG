
package predictions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PredictionsMain {

    @SerializedName("api")
    @Expose
    private Api api;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PredictionsMain() {
    }

    /**
     * 
     * @param api
     */
    public PredictionsMain(Api api) {
        super();
        this.api = api;
    }

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }

}
