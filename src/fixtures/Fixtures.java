
package fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fixtures {

    @SerializedName("api")
    @Expose
    private Api api;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fixtures() {
    }

    /**
     * 
     * @param api
     */
    public Fixtures(Api api) {
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
