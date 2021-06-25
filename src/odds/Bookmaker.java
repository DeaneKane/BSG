
package odds;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bookmaker {

    @SerializedName("bookmaker_id")
    @Expose
    private int bookmakerId;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("bookmaker_name")
    @Expose
    private String bookmakerName;

    public int getBookmakerId() {
        return bookmakerId;
    }

    public void setBookmakerId(int bookmakerId) {
        this.bookmakerId = bookmakerId;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public String getBookmakerName() {
        return bookmakerName;
    }

    public void setBookmakerName(String bookmakerName) {
        this.bookmakerName = bookmakerName;
    }

}
