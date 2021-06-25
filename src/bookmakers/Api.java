
package bookmakers;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Api {

    @SerializedName("results")
    @Expose
    private int results;
    @SerializedName("bookmakers")
    @Expose
    private List<Bookmaker_> bookmakers = null;

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<Bookmaker_> getBookmakers() {
        return bookmakers;
    }

    public void setBookmakers(List<Bookmaker_> bookmakers) {
        this.bookmakers = bookmakers;
    }
}
